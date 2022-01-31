package packageMixed;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class HardcodedPathIO {

	public static void main(String[] args) {
		// hard coded file write to test path nameing strings
		// turns out that on linux the hard path with spaces in it works no problems
		
		String fileOutPath = "/media/rkjc/TECH/Workspace/Workshop-Programming/Java-Workbench/filePracticeZone/folder with spaced name/happyFile.txt";
		File outFile = new File(fileOutPath);  // File to write to
		LocalDateTime myTime = LocalDateTime.now();
		
		//BufferedWriter writer2 = new BufferedWriter(new FileWriter(outFile));
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));
			System.out.println("writing to file - maybe" + myTime.toString());
			writer.write("wrote this writing to the file\n");
			writer.write(myTime.toString());
			writer.close(); 
			
	    } catch (IOException e) {
	        System.err.println(e);
	        System.exit(1);
	    }	
	}

}
