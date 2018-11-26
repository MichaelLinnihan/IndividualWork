package Loops;

import java.util.Scanner;

public class ForLoops {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counter = 0;
		for( counter = 1; counter <= 5; counter++)
		{
			System.out.println(counter);
		}
		for(counter = 1; counter<=10; counter= counter +2)
		{
			System.out.println(counter + "hello");
		}
		for(counter=15; counter<= 60; counter = counter + 5)
		{
			System.out.println(counter + "hello");
		}
		for(counter = 10; counter>= 1; counter--)
		{
			System.out.println(counter + "hello");
		}
		System.out.println("number of times");
		int num = input.nextInt(); 
		for(counter = 1; counter <=num; counter++)
		{
			System.out.println(counter + "hello");
		}
		for(counter = 1; counter<=10; counter++)
		{
			int sum= 0;
			sum = sum + counter;
		}
		num = input.nextInt(); 
		 double sum = 0;
		for(counter = 1; counter<= 50; counter++) {
			 sum = sum + num * counter; 
			 
		}
		System.out.println(sum);
		for(counter = 1; counter<= 5; counter++)
		{
			num = input.nextInt(); 
			sum = 0;
			sum = sum + num;
		}
		System.out.println(sum);
		for(counter = 1; counter<= 10000; counter++)
		{
			num = input.nextInt(); 
			sum = 0;
			sum = sum + num;
		}
		System.out.println(sum);
		for ( counter = 1; counter<=5; counter++)
		{
			num = input.nextInt();
			if (num%2 == 0  ) {
				System.out.println(num + " is even");
			}
			else {
				System.out.println(num + " is odd");
			}
			
		}
		
	}

}
