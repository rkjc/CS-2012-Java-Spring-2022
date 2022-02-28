package pack2passingToMethods;

public class PassingToMethodsMain {

	public static void main(String[] args) {
		System.out.println("starting PTMM");

		String zondar = doThis();
		System.out.println(zondar);

		int x = 1; // x represents an int value
		int[] y = new int[10]; // y represents an array of int values
		y[0] = 345;

		m(x, y); // Invoke m with arguments x and y
		
		System.out.println("x is " + x);
	    System.out.println("y[0] is " + y[0]);

	}

	// -----------------------------------

	public static void m(int number, int[] numbers) {
		number = 1001; // Assign a new value to number
		//numbers[0] = 5555; // Assign a new value to numbers[0]
		int[] zzz = new int[10];
		zzz[0] = 34567;
		numbers = zzz;
	}

	public static String doThis() {
		return "Here you go";
	}

}
