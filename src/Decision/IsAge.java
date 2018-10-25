package Decision;

import java.util.Scanner;

public class IsAge {
	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		if(age == 16) {
			System.out.println("the user is 16");
		}
		if(age != 16) {
			System.out.println("the user is not 16");
		}
		int height = input.nextInt();
		int size = input.nextInt();
		if(height + size >= 26) {
			System.out.println("true");
		}
		System.out.println(height<62 && size>9);
		int pets = input.nextInt();
		int cars = input.nextInt();
		System.out.println(pets>= 5 || cars>3);
		
	
		
	}

}
