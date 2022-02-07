package app;

import java.io.File;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class NumericTypes {

	public static void main(String[] args) {

		try {
			File aThing = new File("sampleText.txt");

			PrintWriter myWriterThing = new PrintWriter(aThing);

			System.out.println("yep it works");

			for (int i = 0; i <= 100; i++) {
				
				double myRandNum = Math.random();
				int myRandOut = (int)(myRandNum * 1001) ;
				
				myWriterThing.print( myRandOut );
				System.out.print( myRandOut );
				
				myWriterThing.print(" ");
			}
			
			myWriterThing.close();
		
		} catch (Exception e) {

		}
	}
}
