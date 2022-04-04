package scratchTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadCRVmain {

	public static void main(String[] args) {
		System.out.println("working");

		try {
			File aFile = new File("practiceFile.crv");
			PrintWriter prtout = new PrintWriter(aFile);
			System.out.println("writeing out to file");

			prtout.println("Adding a bunch, of words, seperated");
			prtout.println("by commas, and on, different lines");

			prtout.flush();
		} catch (Exception e) {
			System.err.println(e);
		}

		String line = "";
		String splitBy = ",";
		try {
			// parsing a CSV file into BufferedReader class constructor
			BufferedReader br = new BufferedReader(new FileReader("practiceFile.crv"));
			while ((line = br.readLine()) != null) { // returns a Boolean value
				String[] subLine = line.split(splitBy); // use comma as separator
				System.out.println(subLine);
				for (int i = 0; i < subLine.length; i++) {
					System.out.println(subLine[i]);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
