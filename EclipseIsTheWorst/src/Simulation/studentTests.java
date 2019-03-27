package Simulation;
import java.util.Scanner;
import java.util.Random;
public class studentTests {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		int avg= 0;
		int avgSum=0;
		System.out.println("how many students?");
		int numStu = input.nextInt();
		System.out.println("how many tests did they take?");
		int numTest = input.nextInt();
		int[][] testScore = new int[numStu][numTest];
		for(int row = 0; row < testScore.length; row++) {
			for(int col = 0; col< testScore[0].length; col++) {
				System.out.println("what was student number "+ row+ ". test number "+ col +"'s score?" );
				testScore[row][col] = input.nextInt();
			}
		}
		for(int col = 0; col< testScore[0].length; col++) {
			int i = 1;
			for(int row = 0; row < testScore.length; row++) {
				avgSum = avgSum + testScore[row][col];
			}
			avg = avgSum/i;
		}
		
	}
}
