package demo1;

public class OurdException1 {
	public static double radius = 0;

	public static void main(String[] args) {

		NullPointerException bob = new NullPointerException("null out wow");

		try {

			setRadius(4.5);

			System.out.println("yep it ran. radius is: " + radius);

			throw bob;

		} catch (NullPointerException e) {
			
			System.out.println(e);
			System.out.println("continue with the null fix it program");
			
		} catch (IllegalArgumentException e) {
			
			System.out.println(e);
			System.out.println("just plain illegal, give up!");
			
		} catch (Exception e) {
			System.out.println(e);
			
		} finally {
			System.out.println("in the finallys");
		}

		System.out.println("the circle crashed but we are continuing on");
	}

	public static void setRadius(double newRadius) throws Exception {
		if (newRadius >= 0)
			radius = newRadius;
		else
			throw new IllegalArgumentException("Radius cannot be negative - dude");

	}
}