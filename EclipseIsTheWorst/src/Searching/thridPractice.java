package Searching;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class thridPractice {
	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("whats your number");
		double userSelect = input.nextDouble();
		double min = 0;
		double max= 1000;
		for(int i = 0; i<= 1000; i++) {
			double r = min + random.nextDouble()*1000;
			list.add(r);
		}
		for(double i:list) {
			
		}
		
		
	}
}
