package mathExamples;

import java.util.Scanner;

public class AverageTestScire {
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("first test score");
		int test1= input.nextInt();
		System.out.println("second test score");
		int test2= input.nextInt();
		System.out.println("third test score");
		int test3= input.nextInt();
		double avg = (test1+test2+test3)/3;
		System.out.println(avg);
	
	
		
	

}
}