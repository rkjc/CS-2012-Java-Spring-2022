package demo2;

public class SecondClass {
	
	private static NullPointerException xceptor = new NullPointerException("waa weaa waa"); 
	
	public static void myCrasher() {
		throw xceptor;
	}

}
