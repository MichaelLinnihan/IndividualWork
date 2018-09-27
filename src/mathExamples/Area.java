package mathExamples;
import java.util.Scanner;
public class Area {
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("what is the base messure");
		int base = input.nextInt();
		int area= base*8;
		System.out.println(area);
	}

}
