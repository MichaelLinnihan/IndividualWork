package Simulation;

import java.util.Random;
import java.util.Scanner;

public class RollDiceMulti {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int fre = 0;
		boolean con = true;
		System.out.println("how many students");
		int numStudents = input.nextInt();
		System.out.println();
		int age = input.nextInt();
		System.out.println("how many sides");
		final int max = input.nextInt();
		final int min = 1;
		System.out.println("how many rolls");
		int numRollsPerStudent = input.nextInt();
		int[][] diceResults = new int[numStudents][numRollsPerStudent];
		System.out.println("would you like to see live results? true or false");
		boolean liveR = input.nextBoolean();
		for (int rows = 0; rows < diceResults.length; rows++) {

			if (liveR == true) {
				for (int colums = 0; colums < diceResults[0].length; colums++) {
					diceResults[rows][colums] = min + random.nextInt(max - min + 1);
					System.out.println(diceResults[rows][colums]);
				}
			} else {
				for (int colums = 0; colums < diceResults[0].length; colums++) {
					diceResults[rows][colums] = min + random.nextInt(max - min + 1);

				}

			}
		}
		do {
			fre = 0;
			System.out.println("Search for a frequency of any number");
			int searchNum = input.nextInt();
			for (int rows = 0; rows < diceResults.length; rows++) {
				for (int colums = 0; colums < diceResults[0].length; colums++) {
					if(diceResults[rows][colums]== searchNum) {
						fre++;
					}
				}
			}
			System.out.println(searchNum +" apeared " + fre + " times");
			System.out.println("would you like to go again?");
			con = input.nextBoolean();
		}while(con = true);

		
		for (int rows = 0; rows < diceResults.length; rows++) {
			System.out.println("");
			System.out.println("Student: " + (rows + 1));
			for (int colums = 0; colums < diceResults[0].length; colums++) {
				System.out.print(diceResults[rows][colums] + ", ");
			}
		}
		System.out.println("would you like to see output by roll now? true or false");
		con = input.nextBoolean();
		if (con == true) {
		for (int colums = 0; colums < diceResults[0].length; colums++) {
			System.out.println("");
			System.out.println("Roll: " + (colums + 1));
			for (int rows = 0; rows < diceResults[0].length; rows++) {
				System.out.print(diceResults[rows][colums] + ", ");
			}
		}
		}
	}
}
