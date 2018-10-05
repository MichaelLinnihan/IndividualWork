package mathExamples;

import java.util.Scanner;

public class Post {
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("width");
		double width= input.nextDouble();
		System.out.println("length");
		double length= input.nextDouble();
		double area =  (length*width)/3;
		System.out.println(area);

}

}
