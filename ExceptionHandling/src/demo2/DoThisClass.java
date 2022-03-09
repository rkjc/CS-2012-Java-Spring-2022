package demo2;

public class DoThisClass {

	public void doDamage() {
		// bunch-o-logic
		int x = 99;
		if (x == 99) {
			throw new IllegalArgumentException("you broke it");
		}
		System.out.println("leaving doDamage");
	}

	public void otherExcept() {
		
		try {
			SecondClass.myCrasher();
		} catch (Exception a) {
			System.out.println("caught in other");
		}
	}

}
