package demo2;

public class ExceptionDemoMain {

	public static void main(String[] args) {

		DoThisClass zondar = new DoThisClass();

		System.out.println("running");

		try { 
			
			
			//zondar.doDamage();
			zondar.otherExcept();
			
			SecondClass.myCrasher();
		
			System.out.println("made it to the end");

			
		} catch (Exception e) {
			System.out.println("you broke something");
			System.out.println(e);
		} finally {
			System.out.println("in the finally");
		}
		
		System.out.println("rest of the program");
		
	}

}
