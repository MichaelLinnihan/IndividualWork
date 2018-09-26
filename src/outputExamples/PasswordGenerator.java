package outputExamples;
import java.util.Scanner;

public class PasswordGenerator {
	public static void main(String [] args)
	{
	
	Scanner input = new Scanner(System.in);
	int one= input.nextInt();
	int two= input.nextInt();
	int three= input.nextInt();	
	System.out.println(one+ "" + two+ "" + three);
	System.out.println(three + "" + one+ "" + two);
	System.out.println(two+ "" + three + "" + one);
	System.out.println(one+ "" + three+ "" + two);
	System.out.println(three+ "" + one+ "" + two);
	System.out.println(two+ "" + one + ""+ three );
	

	
	input.close();
	}

}
