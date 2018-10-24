package oop;

public class RightTri {
	private double base = -999;
	private double height = -999;
	private double c = -999;
	
	public RightTri() {
	}
	public RightTri (double baseX, double heightX) {
		base = baseX;
		height = heightX;
		
	}
	public void hypot() {
		c = Math.pow(base, 2)* Math.pow(height, 2);
		c = Math.sqrt(c);	
		
	}
	public void prim() {	
		double p = base+height+c;	
	}
	public void area() {
		double a = base*height;
		a /= 2;	
	}
	
	
}
