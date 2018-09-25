package outputExamples;
import java.util.Scanner;

public class ageWeight {
	public static void main(String [] args)
	{
	System.out.println("what is your weight");
	Scanner input = new Scanner(System.in);
	//your program starts here
	int weight = input.nextInt();
	System.out.println("you weight " + weight);
	System.out.println("what is your height");
	weight = input.nextInt();
	System.out.println("you height is " + weight);
	input.close();
	}

}
