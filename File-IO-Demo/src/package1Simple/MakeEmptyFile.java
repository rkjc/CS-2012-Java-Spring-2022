package package1Simple;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class MakeEmptyFile {

	public static void main(String[] args) {
		
		System.out.println("making an empty file");
		
		String pathString = "emptyFile.txt";

		try {
			// create a File instance object that connects to the named file and path
			File aFile = new File(pathString); 
			

		} catch (Exception e) {
			// if something breaks catch and print out what went wrong
			System.err.println(e);
		}
	}
}
