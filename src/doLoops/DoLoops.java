package doLoops;

import java.util.Scanner;

public class DoLoops {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("give num");
		int number = input.nextInt();
		int smallest = number;
		int largest = number;
		int newNum = 0;
		do {
			System.out.println("type new number");
			newNum = input.nextInt();
			if (newNum > largest && newNum !=9999) {
				largest = newNum;
			}
			if (newNum < smallest && newNum !=9999) {
				smallest = newNum;
			}
		} while (newNum != 9999);
		System.out.println(largest - smallest);
	}
}
