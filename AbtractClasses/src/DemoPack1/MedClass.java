package DemoPack1;

public class MedClass extends UpperClass implementing SomeInterface {

	
	
	public static void printHello() {
		System.out.println("hey from the static print");
	}
	
	public int getCounter() {
		return super.counter;	
	}

	
}
