package demo2;

public class ExceptionDemoMain {

	public static void main(String[] args) {

		DoThisClass zondar = new DoThisClass();

		System.out.println("running");

		try {

			zondar.doAThing();
			
		} catch (Exception e) {
			System.out.println("kind of the wrong input, eh");
		}

	}

}
