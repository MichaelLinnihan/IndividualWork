package Loops;

import java.util.Scanner;

public class LargestDivisor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("whats your number");
		int num = input.nextInt();
		while(num<0) {
			System.out.println("whats your positive number");
			num = input.nextInt();
		}
		
	}

}
