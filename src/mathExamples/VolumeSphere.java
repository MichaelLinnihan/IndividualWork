package mathExamples;

import java.util.Scanner;

public class VolumeSphere {
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("what is radius");
		double radius = input.nextDouble();
		double area = (4/3)*(radius * radius* radius ) * Math.PI; 
		System.out.println("the volume is " + area);
	
		
	}

}
