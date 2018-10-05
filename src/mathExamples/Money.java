package mathExamples;

import java.util.Scanner;

public class Money {
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("money");
		int money= input.nextInt();
		
		//dollar 
		int dollar = (money/100);
		//quarter
		int numQ= (money / 25);		
		//dime
		int numD = (money % 25 / 10);	
		//nickel
		int numN = (money %25%10/5);
		//penny
		int numP = (money%100%25%10%5/1);
		System.out.println(numQ);
		System.out.println(numD);
		System.out.println(numN);
		System.out.println(money);
		
	
	
		
	}
}
