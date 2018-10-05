package mathExamples;

import java.util.Scanner;

public class Volume {
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("what is the base messure");
		int width = input.nextInt();
		System.out.println("what is the height messure");
		int height= input.nextInt();
		System.out.println("what is the base messure");
		int length = input.nextInt();
		int volume = width*height*length;
		System.out.println(volume);
	}

}
