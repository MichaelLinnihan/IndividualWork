package Decision;

import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("salary?");
		int salary = input.nextInt();
		if (salary <= 20000) {
			System.out.println("worker");
		}
		if (salary > 20000) {
			if (salary < 40000) {
				System.out.println("management");
			}
			if (salary > 40000 && salary < 100000) {
				System.out.println("CEO");
			}
			if (salary >= 100000) {
				System.out.println("Owner");
			}
		}
	}

}
