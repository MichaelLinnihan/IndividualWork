package oop;

import java.util.Scanner;

public class Home {
	public Home() {

	}

	public void Paint() {
		Scanner input = new Scanner(System.in);
		int height = input.nextInt();
		int length = input.nextInt();
		int Area = length * height;
		int hours = Area / 200;
		int min = hours/60;
		System.out.println(min);
		
	}
	

}
