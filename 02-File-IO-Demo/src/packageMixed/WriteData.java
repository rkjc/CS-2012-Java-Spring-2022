package packageMixed;

import java.io.File;
import java.io.PrintWriter;

public class WriteData {
	public static void main(String[] args) {

		File file = new File("demoFiles/bogusList.txt");

		try {
//			if (file.exists()) {
//				System.out.println("File already exists");
//				throw new Exception("file exists");
//			}
			
			PrintWriter output = new PrintWriter(file);

			// Write formatted output to the file
			String firstN = "Richard";
			String lastN = "Cross";
			String IDnum = "8183351234";
			
			output.print(firstN + ";");
			output.print(lastN + ";");
			output.print(IDnum + ";");

			// Close the file
			output.close();

		} catch (Exception x) {
			System.out.println(x);
		}
	}
}
