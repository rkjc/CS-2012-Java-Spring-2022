package clonable;

public class ClonableDemoMain {

	public static void main(String[] args) {

		House houseOne = new House(11, 1234);
		House houseTwo = new House(22, 9400);

		System.out.println(houseOne);
		System.out.println(houseTwo);

		//houseOne = houseTwo;
		
		//houseOne = houseTwo.makeItAgain();
		
		houseOne = (House) houseTwo.clone();

		System.out.println(houseOne);
		System.out.println(houseTwo);

		houseTwo.setID(99);

		System.out.println(houseOne);
		System.out.println(houseTwo);	
		
	}

}
