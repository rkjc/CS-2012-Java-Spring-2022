package pack1;

public class StartHereMain {

	public static void main(String[] args) {
		
		String message = new String("Welcome to Java");
		System.out.println(message);	
		
		String luke = "h";
		
		luke = luke + "a";
		luke = luke + "p";
		luke = luke + "p";
		luke = luke + "y";
		
		System.out.println(luke);

		StringBuilder sb1 = new StringBuilder();
		sb1.append("h");
		sb1.append("a");
		sb1.append("p");
		sb1.append("p");
		sb1.append("y");
		
		System.out.println(sb1);
		
	}

}
