package RandomNum;

import java.util.Scanner;
import java.util.Random;

public class RollDice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("how many sides does the dice have");
		Random random = new Random();
		int max = input.nextInt();
		int min = 1;
		System.out.println("how many times do you want to roll");
		int roll = input.nextInt();
		for (int i = 0; i <= roll; i++) {
			int randomNum = min + random.nextInt(max - min + 1);
			System.out.println(randomNum);
		}
	}

}
