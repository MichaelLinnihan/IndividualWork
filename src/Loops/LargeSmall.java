package Loops;

import java.util.Scanner;

public class LargeSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("whats your test score");
		double score = input.nextDouble();
		while (score!= 9999) {
			System.out.println("test score?");
			double newScore = input.nextDouble();
			if (newScore == 9999) {
				System.out.println(score);
			}
			if (newScore> score) {
				score = newScore;
			}
			
		}
		
	}

}
