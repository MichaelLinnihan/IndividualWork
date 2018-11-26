package doLoops;

public class Circle {
	private double radius = -999999;
	public Circle(){	
	}
	public Circle(double radiusX) {
		radius = radiusX;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radiusX) {
		radius = radiusX;
				
	}
	public double area() {
		double area = Math.pow(radius, 2)*Math.PI;
		return area;
	}
	public double circumference() {
		double circumference = (radius*2)*Math.PI;
		return circumference;
	}
}
