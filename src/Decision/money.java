package Decision;
import java.util.Scanner;
public class money {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("what is your age");
		int age = input.nextInt();
		System.out.println("what is your GPA");
		double gpa = input.nextDouble();
		int money = -999;
		if (gpa + age >= 20) {
			money = 250;
		}
		else {
			money = 30;
		}
	}
}
