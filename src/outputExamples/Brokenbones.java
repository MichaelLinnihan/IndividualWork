package outputExamples;
import java.util.Scanner; 


public class Brokenbones {
	public static void main(String [] args)
	{
	System.out.println("how mamy bones haave you broken");
	Scanner input = new Scanner(System.in);
	//your program starts here
	int numBones = input.nextInt();
	System.out.println("you have broken " + numBones + " bones");
	input.close();
	}

}