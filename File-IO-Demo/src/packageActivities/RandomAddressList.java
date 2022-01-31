package packageActivities;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomAddressList {

	public static void main(String[] args) {
		//note* files are in a subfolder named 'demoFile' which has to be manually created
		
		ArrayList<String> firstnames = new ArrayList<>();
		ArrayList<String> lastnames = new ArrayList<>();
		ArrayList<String> areacodes = new ArrayList<>();
		
		String tempText = "";
		
		// --- read files ---
		
		// makeing File objects to hold the file names/paths
		File firstNameFile = new File("demoFiles/firstNames.txt"); // File to read from
		File lastNameFile = new File("demoFiles/lastNames.txt"); // File to read from
		File areaCodeFile = new File("demoFiles/areaCodes.txt"); // File to read from

		try {
			// attaching scanners to each of the files being read from
			Scanner fnScan = new Scanner(firstNameFile);
			Scanner lnScan = new Scanner(lastNameFile);
			Scanner acScan = new Scanner(areaCodeFile);

			// loading the ArrayLists from the files
			while (fnScan.hasNext()) {
				tempText = fnScan.nextLine();
				firstnames.add(tempText);
				//System.out.println(tempText);  //for debugging
			}
			
			while (lnScan.hasNext()) {
				tempText = lnScan.nextLine();
				lastnames.add(tempText);
				//System.out.println(tempText);  //for debugging
			}

			while (acScan.hasNext()) {
				tempText = acScan.nextLine();
				areacodes.add(tempText);
				//System.out.println(tempText);  //for debugging
			}

			// cleaning up the resources
			fnScan.close();
			lnScan.close();
			acScan.close();
		} catch (Exception x) {
			System.out.println("error is in the file reading block");
			System.out.println(x);
		}

		// ---- writing files section ----
	
		// making an ArrayList of email extensions to randomize from
		ArrayList<String> emailCompanies = new ArrayList<>();
		emailCompanies.add("gmail.com");
		emailCompanies.add("aol.com");
		emailCompanies.add("hotmail.com");
		emailCompanies.add("yahoo.com");
		emailCompanies.add("fred.org");
		emailCompanies.add("calstatela.edu");
		
		
		String firstName = "";
		String lastName = "";
		String phoneNumber = "";
		String writeToFile = "demoFiles/phoneBook.txt";
		
		try {	
			// using the FileWriter and PrintWriter classes
			FileWriter phoneBookFile = new FileWriter(writeToFile); //Set true for append mode
			PrintWriter prtout = new PrintWriter(phoneBookFile);

			// repeat for however many entries you need
			for(int c = 0; c < 20; c++){
				// get a random first name from the ArrayList
				firstName = (firstnames.get(((new Random()).nextInt(firstnames.size()))));
				firstName = firstName.trim();

				// get a random last name from the ArrayList
				lastName = (lastnames.get(((new Random()).nextInt(lastnames.size()))));
				lastName = lastName.trim();
				
				// generate simulated phone number
				StringBuilder bob = new StringBuilder();
				for (int i = 0; i < 7; i++) {
					bob.append(String.valueOf(((new Random()).nextInt(9))));
				}
				phoneNumber = areacodes.get(((new Random()).nextInt(areacodes.size()))) + bob;

				// generate simulated email address
				String email = String.valueOf(firstName.charAt(0)).toLowerCase() + lastName.substring(0,Math.min(5,lastName.length())).toLowerCase() + "@" + 
						emailCompanies.get(((new Random()).nextInt(emailCompanies.size())));
				
				// assemble all the pieces and print them to the file
				prtout.print(firstName + ";" + lastName + ";" + phoneNumber + ";" + email + ";\n");
			}

			// cleaning up the resources
			prtout.close();
			phoneBookFile.close();
		} catch (Exception x) {
			System.out.println("error is in the writing block");
			System.out.println(x);
		}

	}
}

