package Review;

import java.util.Random;
import java.util.Scanner;

public class Act2 {
	public static void main(String[] args) {
		final int min = 1;
		final int max = 100;
		final int rows = 50;
		final int cols = 50;
		int sum = 0;
		Random random = new Random();
		Rectangle[][] rectangles = new Rectangle[rows][cols];
		for (int i = 0; i < rectangles.length; i++) {
			for (int j = 0; j < rectangles[0].length; j++) {
				rectangles[i][j] = new Rectangle();
			}

		}
		for (int i = 0; i < rectangles.length; i++) {
			for (int j = 0; j < rectangles[0].length; j++) {
				rectangles[i][j].setWidth(min + random.nextInt(max - min + 1));
				rectangles[i][j].setLength(min + random.nextInt(max - min + 1));
				sum += rectangles[i][j].perimeter();
			}
		}

		System.out.println(sum);
	}
}
