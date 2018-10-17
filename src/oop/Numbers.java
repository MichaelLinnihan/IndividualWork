package oop;

public class Numbers {
	public Numbers() {

	}
	public void sayNumber (double num) {
		System.out.println(num);
	}
	public void plusTwo (double num) {
		System.out.println(num+2);
	}
	public void sumOf(double num, double num2) {
		System.out.println(num+num2);
	}
	public void squareOf (int num) {
		System.out.println(num*num);
	}
	public void areaOf (int width, int length) {
		System.out.println(width *length);
	}
	public void roundUp (double num) {
		System.out.println(Math.round(num));
	}
}
