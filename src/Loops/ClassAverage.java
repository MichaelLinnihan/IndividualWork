package Loops;

import java.util.Scanner;

public class ClassAverage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("how many students");
		int num = input.nextInt();
		int score = 0; 
		int sum = 0;
		for(int i = 1; i<= num;i++) {
			System.out.println("whats the score");
			score = input.nextInt();
			sum = sum + score;
		}
		double average = sum/num;
		System.out.println("the class average is " + average);
	}
}
