package packageMixed;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class getFromList {

	public static void main(String[] args) {
		File aFile = new File("demoFiles/samples.txt"); // File to read from

		String tempText = "";
		ArrayList<String> store = new ArrayList<>();
		
		try {
			Scanner myScan = new Scanner(aFile);
			while(myScan.hasNext()) {
				tempText = myScan.nextLine();	
				store.add(tempText);
				//System.out.println(tempText);
			}
			myScan.close();
		} catch (Exception x) {
			System.out.println(x);
		}
		
		int indx = new Random().nextInt(store.size());
		System.out.println(store.get(indx));
		

	}

}
