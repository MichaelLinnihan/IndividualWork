package mathExamples;

import java.util.Scanner;

public class CuttingGrass {
	public static void main(String [] args)
	{
	Scanner input = new Scanner(System.in);
	System.out.println("width");
	double width = input.nextDouble();
	System.out.println("length");
	double length = input.nextDouble();
	System.out.println("radius");
	double radius = input.nextDouble();
	double fountainA = Math.PI * radius * radius;
	double lawnA = (width * length);
	double cost = (lawnA - fountainA) *1.25 / 100;
	System.out.println(cost);
		
	
	
	}
}
