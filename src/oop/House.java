package oop;

import java.util.Scanner;

public class House {
	public House() {
		
	}
	static void one(){
		Scanner input = new Scanner(System.in);
		System.out.println("length");
		int length = input.nextInt();
		System.out.println("width");
		int width = input.nextInt();
		System.out.println("depth");
		int depth = input.nextInt();
		System.out.println("rate");
		int rate = input.nextInt();
		System.out.println(length * width * depth/rate);
		
	}
	static void two (double volume, double rate) {
		System.out.println(volume /rate);
		
	}
	static double three (double volume, double rate) {
		return volume /rate;
	}
	
	

}
