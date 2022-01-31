package packageSimple;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileIO_writeOne {

	public static void main(String[] args) {

		// this will expect the file to exist in the default location
		String pathString = "testFile01.txt";

		try {
			// create a File instance object that connects to the named file and path
			File aFile = new File(pathString); // use (pathString , true) to append to the file

			// create a PrintWriter for easy interaction with the FileWriter instance object
			PrintWriter prtout = new PrintWriter(aFile);

			// print this text into the file
			prtout.println("hello text to file writing world!");

			// make sure that all pending print operations were sent to the file
			prtout.flush();

			// clean up the resources used
			prtout.close();

		} catch (IOException e) {
			// if something breaks catch and print out what went wrong
			System.err.println(e);
		}
	}
}
