package scratchTest;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ScratchTestIO {

	public static void main(String[] args) {	
		
		runCreateJobList();
	}
	
	public static void runCreateJobList() {
		// gets list of previous day unfinished jobs
		String pathString = "workOrder.txt";
		ArrayList<String> workInput = new ArrayList<>();

		try {
			File aFile = new File(pathString);
			Scanner myScan = new Scanner(aFile);
			String tempText = "";

			System.out.println("entering scan loop");
			while(myScan.hasNext()) {
				
				String lineInput = myScan.nextLine();
				
				System.out.println("lineInput " + lineInput);
				
				if(lineInput.equals("Cake")){
					System.out.println("yes it is  cake");
					
					int newTime = myScan.nextInt();
					myScan.nextLine(); // consumes the newline char
					System.out.println("cake time is " + newTime);
					//int newOrderNumber = myScan.nextInt();
				}
//
//
//				} else if(lineInput.equals("Pie")) {
//					System.out.println("inside Pie test");
//					int newTime = myScan.nextInt();
//					int newOrderNumber = myScan.nextInt();
//					

//				} else {
//					throw new Exception("bad file format");
//				}
				System.out.println("bottom of loop");
			}
			
			myScan.close();

		} catch (Exception x) {
			// if it breaks catch and print out what went wrong
			System.out.println(x);
		}

	}
	
}
