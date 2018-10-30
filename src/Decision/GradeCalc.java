package Decision;

import java.util.Scanner;

public class GradeCalc {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("whats your test avg");
		int test = input.nextInt();
		System.out.println("whats your hw avg");
		int hw = input.nextInt();
		System.out.println("is your teacher nice");
		boolean nice = input.nextBoolean();
		if (nice == true) {
			if (test > hw) {
				System.out.println("your grade is " + test);
			} else {
				System.out.println("your grade is " + hw);
			}
		}
		if (nice == false) {
			if (test < hw) {
				System.out.println("your grade is " + test);
			} else {
				System.out.println("your grade is " + hw);
			}
		}
	}

}
