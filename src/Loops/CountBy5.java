package Loops;

import java.util.Scanner;

public class CountBy5 {
	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		System.out.println("whats your number big boi bugger");
		int num = input.nextInt();
		int x = 0;
		while (x<num) {
			System.out.println(x);
			x = x+5;
		}
	}
}
