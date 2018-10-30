package Decision;

import java.util.Scanner;

public class IsAge {
	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		System.out.println("whats your age");
		int age = input.nextInt();
		if(age == 16) {
			System.out.println("the user is 16");
		}
		if(age != 16) {
			System.out.println("the user is not 16");
		}
		if(age >= 18) {
			System.out.println("you finna bout to catch case");
			
		}
		System.out.println("have a nice day");
		int height = input.nextInt();
		int size = input.nextInt();
		if(height + size >= 26) {
			System.out.println("true");
		}
		System.out.println(height<62 && size>9);
		System.out.println("how many pets.");
		int pets = input.nextInt();
		System.out.println("how many cars");
		int cars = input.nextInt();
		System.out.println(pets>= 5 || cars>3);
		int mNum = 4;
		System.out.println("whats tha magic number");
		int gNum = input.nextInt();
		if(mNum == gNum) {
			System.out.println("you the bestest");
		}
		
	
		
	}

}
