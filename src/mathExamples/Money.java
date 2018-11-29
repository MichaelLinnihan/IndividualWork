package mathExamples;

import java.util.Scanner;

public class Money {
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("cost");
		double con= 0;
		double tot = 0;
		while(con != 9) {
			con = 0;
			System.out.println("cost");	
			con = input.nextDouble();
			tot = tot+ con;
		}
		System.out.println('p');
		double p = input.nextDouble();
		System.out.println(p - tot);
	
	
		
	}
}
