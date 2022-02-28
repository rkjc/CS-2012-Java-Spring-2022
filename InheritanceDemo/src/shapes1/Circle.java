package shapes1;

public class Circle extends GeometricObject {

	public Double radius = 1.0;
	
	public Circle() {
	}
	
	public Circle(String newColor) {
		this.color = newColor;
	}
	
	public double getArea() {
		return 2 * 3.14159 * radius * radius;
	}
	

}
