package packageDemo;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomAddressGenerator {

	public static void main(String[] args) {

		String tempText = "";

		ArrayList<String> firstnames = new ArrayList<>();
		ArrayList<String> lastnames = new ArrayList<>();
		ArrayList<String> areacodes = new ArrayList<>();

		// ---reading form files ---

		// this will expect the file to exist in the default location
		String firstNamePath = "firstNames.txt";
		String lastNamePath = "lastNames.txt";
		String areaCodesPath = "areaCode.txt";

		try {
			File firstNameFile = new File(firstNamePath);
			File lastNameFile = new File(lastNamePath);
			File areacodesFile = new File(areaCodesPath);

			Scanner fnScan = new Scanner(firstNameFile);
			Scanner lnScan = new Scanner(lastNameFile);
			Scanner acScan = new Scanner(areacodesFile);

			while (fnScan.hasNext()) {
				tempText = fnScan.nextLine();
				firstnames.add(tempText);
			}

			while (lnScan.hasNext()) {
				tempText = lnScan.nextLine();
				lastnames.add(tempText);
			}

			while (acScan.hasNext()) {
				tempText = acScan.nextLine();
				areacodes.add(tempText);
			}

			System.out.println(firstnames.get((int) (new Random()).nextInt(firstnames.size())));

			fnScan.close();
			lnScan.close();
			acScan.close();

		} catch (Exception x) {
			// if it breaks catch and print out what went wrong
			System.out.println(x);
		}

		// --- write to file ---
		String pathString = "phoneBook.txt";

		try {
			File outputFile = new File(pathString);
			PrintWriter prtout = new PrintWriter(outputFile);

			for (int i = 0; i < 10; i++) {
				String firstname = firstnames.get((int) (new Random()).nextInt(firstnames.size()));
				String lastname = lastnames.get((int) (new Random()).nextInt(lastnames.size()));
				String phonenumber = makePhoneNum(areacodes.get((int) (new Random()).nextInt(areacodes.size())));
				String email = genEmail(firstname, lastname);

				prtout.println(firstname + ";" + lastname + ";" + phonenumber + ";" + email + ";");

			}

			prtout.flush();
			prtout.close();

		} catch (IOException e) {
			// if something breaks catch and print out what went wrong
			System.err.println(e);
		}

	}

	// ------- methods ----------
	
	public static String makePhoneNum(String ac) {
		StringBuilder bob = new StringBuilder();
		bob.append(ac);
		for (int i = 0; i < 7; i++) {
			bob.append(String.valueOf((new Random().nextInt(9))));
		}
		return bob.toString();
	}

	public static String genEmail(String fn, String ln) {
		ArrayList<String> emailExt = new ArrayList<>();
		emailExt.add("gmail.com");
		emailExt.add("yahoo.com");
		emailExt.add("aol.com");
		emailExt.add("hotmail.com");
		emailExt.add("att.net");
		emailExt.add("spectrum.net");
		emailExt.add("calstatela.edu");
		StringBuilder bob = new StringBuilder();
		bob.append(fn.toLowerCase().charAt(0) + ln.toLowerCase().substring(0, Math.min(5,  ln.length())) + "@");	
		bob.append(emailExt.get((int) (new Random()).nextInt(emailExt.size())));
		return bob.toString();
	}
}
