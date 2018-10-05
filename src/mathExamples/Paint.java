package mathExamples;

import java.util.Scanner;

public class Paint {
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("length");
		double length= input.nextDouble();
		System.out.println("width");
		double width = input.nextDouble();
		double paintUsed  = (length * 8*2)+(width *8*2); 
		paintUsed = paintUsed/150;
		System.out.println(paintUsed);
	
	
		
	}


}