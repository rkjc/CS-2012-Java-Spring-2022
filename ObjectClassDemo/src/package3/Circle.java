package package3;

public class Circle {

	private double radius;
	private String color;
	
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
