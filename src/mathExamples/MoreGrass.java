package mathExamples;

import java.util.Scanner;

public class MoreGrass {
	public static void main(String [] args)
	{
	Scanner input = new Scanner(System.in);
	System.out.println("width in yards");
	double width = input.nextDouble();
	System.out.println("length in yards");
	double length = input.nextDouble();
	System.out.println("speed in mph");
	double speed = input.nextDouble();
	speed = speed *1760;
	System.out.println("deck size");
	double deck = input.nextDouble();
	double lawnA = (width * length);
	double rate = speed *deck; 
	double cost = lawnA/ rate *12;
	System.out.println(cost);
		
	
	
	}


}
