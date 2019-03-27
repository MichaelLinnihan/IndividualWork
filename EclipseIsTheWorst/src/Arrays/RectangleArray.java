package Arrays;

import java.util.Scanner;

import ArrayLists.Circle;

import java.util.Random;
public class RectangleArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		final int min = 0;
		final int max = 100;
		Circle[][] circleArray = new Circle[17][4];
		for(int row = 0; row < circleArray.length;row++) {
			for(int col=0; col < circleArray[0].length ; col++) {
				circleArray[row][col] = new Circle(); 	
				circleArray[row][col].setRadius(min + random.nextInt(max - min + 1));
			}
		}
		for(int row = 0; row < circleArray.length;row++) {
			for(int col=0; col < circleArray[0].length ; col++) {
				System.out.println(circleArray[row][col].getRadius());
				
			}
		}
	
	}
}
