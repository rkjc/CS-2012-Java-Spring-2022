package pack1;

import java.math.BigInteger;

public class CheckWrapersMain {

	public static void main(String[] args) {

		
		SampleObject bob = new SampleObject();
		
	
		bob.tree = 14;
		
		System.out.println( SampleObject.tree );
		
		SampleObject.tree = 100;
		
		System.out.println( SampleObject.tree );
		
		System.out.println( bob.tree );
		
	}

}
