package Loops;

import java.util.Scanner;

public class NestingLoops {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int i = 0;
		int h = 0;
		int largest = 0;
		int answer= 0;
		for (i = 1; i <= 5; i++) {

			for (counter = 1; counter <= 10; counter++) {
				System.out.println(i + " hello world");
			}
		}
		int count = 0;
		for (i = 1; i<=4; i++) {
			for(count =1; count<=5; count++) {
				System.out.println(i * count);
			}
		}
		for(i = 1; i <= 5; i++) {
			System.out.println("1"+ "2"+ i +"4"+ "5");
		}
		for(i = 1; i <= 1000; i ++) {
			h = 0;
			for(int divisor = 1; divisor <= i; divisor++) {
				if(i%divisor== 0) {
					h++;
				}
				if(h> largest) {
					largest = h;
					answer = i; 
				}
			
			}
			
		}
		System.out.println(largest);	
		System.out.println(answer);
	}
}
