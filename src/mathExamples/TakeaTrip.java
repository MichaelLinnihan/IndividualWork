package mathExamples;

import java.util.Scanner;

public class TakeaTrip {
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("what was the total number of miles");
		double totalMiles= input.nextDouble();
		System.out.println("what is ur cars mpg");
		double mpg = input.nextDouble();
		System.out.println("how much money did you spend");
		double moneySpent = input.nextDouble();
		double averageCost= totalMiles/mpg;
		averageCost = moneySpent/ averageCost; 
		System.out.println(averageCost);
	
	
		
	}

}
