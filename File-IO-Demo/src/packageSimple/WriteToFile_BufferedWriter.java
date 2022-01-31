package packageSimple;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteToFile_BufferedWriter {

	public static void main(String[] args) {
		
		File myfile1 = new File("testWrite77.txt"); // File to write to
			
		try {
			FileWriter fw1 = new FileWriter(myfile1);

			BufferedWriter bwriter = new BufferedWriter(fw1);

			bwriter.write("wrote this to the file:\nand added this as well");

			bwriter.flush();

			bwriter.close();
			fw1.close();
			
		} catch (Exception x) {
			System.out.println(x);
		}
			

	}

}
