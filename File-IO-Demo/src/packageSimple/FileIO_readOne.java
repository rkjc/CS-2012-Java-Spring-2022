package packageSimple;

import java.io.File;
import java.util.Scanner;

public class FileIO_readOne {

	public static void main(String[] args) {

		// this will expect the file to exist in the default location
		String pathString = "firstNames.txt";
		
		try {		
			//create a File instance object that connects to the named file and path
			File aFile = new File(pathString); 
			
			// make a Scanner object connected to that file so that it can be read from
			Scanner myScan = new Scanner(aFile);

			// this is very fragile and will break if the file is empty
			String tempText = myScan.nextLine();
			
			System.out.println(tempText);

			// clean up the open resources
			myScan.close();

		} catch (Exception x) {
			// if it breaks catch and print out what went wrong
			System.out.println(x);
		} 

	}
}
