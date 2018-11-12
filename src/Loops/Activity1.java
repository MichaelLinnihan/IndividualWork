package Loops;
import java.util.Scanner; 
public class Activity1 {
	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		
		int i = 0;
		while(i <=100) {
			System.out.println(i);
			i++;
		}
		i = 0;
		
		while(i <=1000000) {
			System.out.println(i);
			i= i+2; 
		}
		i =0;
		System.out.println("how many times");
		int butts = input.nextInt();
		while(i <= butts) {
			System.out.println(i);
			i= i+2; 
		}
		i = 0; 
		int sum = 0;
		butts = input.nextInt();
		while(i<=butts) {
			i= i+2; 
			sum = sum+i;
		}
		System.out.println(sum);
		
		int control = input.nextInt();
		while(control != 1) {
			control = control *2;
			System.out.println(control);
			control = input.nextInt();
		}
		
		System.out.println("first (type -0.1 to stop)");
		double first =  input.nextDouble();
		System.out.println("second");
		double second =  input.nextDouble();
		while (first != -0.1) {
			double average = (first + second)/2;
			System.out.println(average);
			System.out.println("first (type -0.1 to stop)");
			first =   input.nextDouble();
			System.out.println("second");
			second =  input.nextDouble();
		}
		
	}

}
