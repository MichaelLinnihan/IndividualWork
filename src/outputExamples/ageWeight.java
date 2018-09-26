package outputExamples;
import java.util.Scanner;

public class ageWeight {
	public static void main(String [] args)
	{
	System.out.println("what is your weight");
	Scanner input = new Scanner(System.in);
	//your program starts here
	double allVar = input.nextInt();
	System.out.println("you weight " + allVar);
	System.out.println("what is your height");
	allVar = input.nextInt();
	System.out.println("you height is " + allVar);
	input.close();
	}

}
