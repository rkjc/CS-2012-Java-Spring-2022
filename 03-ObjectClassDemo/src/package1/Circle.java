package package1;

public class Circle {

	private double radius;
	public String color;
	
	// -----------------------------------
	public Circle() {
	}
	
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
	
	public void setRadius(double inRad) {
		radius = inRad;
	}
	
	public double getArea() {
		return radius * radius * 3.14159;
	}
	


	
}
