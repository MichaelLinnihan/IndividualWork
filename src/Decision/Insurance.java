package Decision;
import java.util.Scanner;
public class Insurance {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cost = 200;
		System.out.println("How old are you");
		int age = input.nextInt();
		if (age >75 ) {
			cost = cost +125;
		}
		if (age < 30) {
			cost = cost -25;
		}
		System.out.println("How mcuh do you weigh");
		int w = input.nextInt();
		if (w>700) {
			cost = cost + 300;
		}
		System.out.println("do you smoke");
		boolean s = input.nextBoolean();
		if (s ==true ) {
			cost = cost +30;
		}
		else {
			cost = cost -40;
		}
		System.out.println(cost);
	}
	}


