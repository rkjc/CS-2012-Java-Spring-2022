package pack1;

public class StringCompareComparison {

	public static void main(String[] args) {
		String s1 = "Welcome to Java";
		String s2 = new String("Welcome to Java");
		String s3 = "Welcome to Java";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2);
		
		System.out.println("s1 == s2 is " + (s1 == s2));
		System.out.println("s1 == s3 is " + (s1 == s3));
		System.out.println("s1 == s2 is " + (s1.equals(s2)));
		System.out.println("s1 == s3 is " + (s1.equals(s3)));
		
		System.out.println(s1.getClass());
		
		Triangle zondar = new Triangle();
		
		StringBuilder montey = new StringBuilder();
		
		
	}

}
