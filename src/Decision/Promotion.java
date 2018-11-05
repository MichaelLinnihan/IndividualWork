package Decision;

import java.util.Scanner;

public class Promotion {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double close = 0.001;
		int age = input.nextInt();
		double xp = input.nextDouble();
		double h = input.nextDouble();
		if (age > 50 && xp - 10.5 < close && h >= 70 || h >= 80) {
			System.out.println("you get promotion");
		}
		if (age < 50 && h >= 70 && h < 80) {
			System.out.println("you get promotion");
		}
	}

}
