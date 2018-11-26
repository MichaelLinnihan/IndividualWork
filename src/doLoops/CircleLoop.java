package doLoops;

import java.util.Scanner;

public class CircleLoop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double circle1 = 0;
		double circle2 = 0; 
		double circle3 = 0;
		double largest = 0;
		double smallest= 0;
		do {
			System.out.println("First circle Radius");
			circle1= input.nextDouble();
			Circle circleOne = new Circle(input.nextDouble());
			circleOne.setRadius(circle1);
			circle1 = circleOne.circumference();
			System.out.println(circleOne.circumference());
			largest = circleOne.getRadius();
			smallest = circle1; 
			//circle2
			System.out.println("Second circle radius");
			circle2 = input.nextDouble();
			Circle circleTwo= new Circle();
			circleTwo.setRadius(circle2);
			circle2 = circleTwo.circumference();
			System.out.println(circle2);
			if(circle2 > largest) {
				largest = circle2;
			}
			if(circle2 < smallest) {
				smallest = circle2;
			}
			//third circle
			System.out.println("Third circle radius");
			circle3 = input.nextDouble();
			Circle circleThree= new Circle();
			circleThree.setRadius(circle3);
			circle3 = circleThree.circumference();
			System.out.println(circle3);
			if(circle3 > largest) {
				largest = circle3;
			}
			if(circle3 < smallest) {
				smallest = circle3;
			}
			//output
			System.out.println(largest);
			System.out.println(smallest);
			
			
			
		}while(circle1!= 9999);
	}
}
