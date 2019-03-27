package Interface;

public class Circle {
	private double radius; 
	public Circle() {
		radius = 1;
	}
	public Circle(double radiusx) {
		radius = radiusx;
	}
	public  double getRadius() {
		return radius;
	}
	public double area() {
		return (radius*radius )*Math.PI;
	}
	public double p() {
		return 2*Math.PI*radius;
	}
	
}
