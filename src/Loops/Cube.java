package Loops;
import java.util.Scanner;
public class Cube {
	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		System.out.println("what is your number");
		int i = input.nextInt();
		while (i != -1) {
			System.out.println(i * i * i);
			System.out.println("what is your number");
			i = input.nextInt();
		}
		
	}
}
