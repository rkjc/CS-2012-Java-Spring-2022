package package1;

public class Circle {

	private double radius;
	String color;
	
	// -----------------------------------
	public Circle(double inRad) {
		radius = inRad;
	}
	
	public Circle(double inRad, String color) {
		radius = inRad;
		this.color = color;
	}
	// -----------------------------------
	
	public double getRadius() {
		return radius;
	}
	
	double getArea() {
		return radius * radius * 3.14159;
	}
	
	public void setRadius(double inRad) {
		radius =inRad;
	}

	
}
