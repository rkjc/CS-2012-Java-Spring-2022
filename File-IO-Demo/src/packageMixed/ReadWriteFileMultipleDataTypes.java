package packageMixed;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteFileMultipleDataTypes {

	public static void main(String[] args) throws IOException {
		// Write content to file
		writeFileContents();
		// Reading content of file using Scanner class
		readFileContents();
	}

	private static void writeFileContents() throws IOException {

		try (FileWriter fileWriter = new FileWriter("info.txt")) {
			fileWriter.write("10 ");
			fileWriter.write("20.5 ");
			fileWriter.write("Employee ");
			fileWriter.write("50.00 ");
			fileWriter.write("Coffee");
		}
	}

	private static void readFileContents() throws IOException {
		System.out.println("Reading contents of file using Scanner class:");
		try (FileReader fileReader = new FileReader("info.txt"); 
				Scanner scanner = new Scanner(fileReader)) {
			while (scanner.hasNext()) {
				if (scanner.hasNextInt()) {
					System.out.println(scanner.nextInt());
				} else if (scanner.hasNextDouble()) {
					System.out.println(scanner.nextDouble());
				} else if (scanner.hasNext()) {
					System.out.println(scanner.next());
				}
			}
		}
	}
}

// https://makeinjava.com/java-scanner-example-read-write-contents-file-example/
