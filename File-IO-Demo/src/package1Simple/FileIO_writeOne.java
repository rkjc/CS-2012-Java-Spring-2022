package package1Simple;

import java.io.File;
import java.io.PrintWriter;

public class FileIO_writeOne {
	public static void main(String[] args) {

		try {
			// create a File instance object that connects to the named file and path
			// use File(pathString , true) to append to the file, default is to overwrite
			File aFile = new File("writeOneFile.txt");

			// create a PrintWriter for easy interaction with the FileWriter instance object
			PrintWriter prtout = new PrintWriter(aFile);

			// print this text into the file
			prtout.println("hello text to file writing world!");		
					
			// make sure that all pending print operations were sent to the file before closing
			prtout.flush();

			// clean up the resources used, close the PrintWriter
			prtout.close();

		} catch (Exception e) {
			// if something breaks catch and print out what went wrong
			System.err.println(e);
		}
	}
}
