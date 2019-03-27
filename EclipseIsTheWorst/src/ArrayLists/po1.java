package ArrayLists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class po1 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
		double largest = 0;
		double smallest = 999999999;
		int indexOfL = 0;
		int indexOfS =0;
		int min = 1;
		int max = 50;
		for (int i = 0; i <= 19; i++) {
			rectangles.add(new Rectangle(min + random.nextInt(max - min + 1), min + random.nextInt(max - min + 1)));

		}

		for (int i = 0; i < rectangles.size(); i++) {
			if (rectangles.get(i).area() > largest) {
				largest = rectangles.get(i).area();
				indexOfL = i ;
			}
			if (rectangles.get(i).area() < smallest) {
				smallest = rectangles.get(i).area();
				indexOfS =i;
			}
			
		}
	
		rectangles.set(19, rectangles.get(indexOfS) );
		rectangles.set(0,rectangles.get(indexOfL) );
		for (int i = 0; i < rectangles.size(); i++) {
			System.out.println(rectangles.get(i).area());

		}

		
	}
	
}

