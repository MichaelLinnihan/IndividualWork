package Decision;
import java.util.Scanner;
public class Honors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("what is ur gpa");
		double gpa = input.nextDouble();
		System.out.println("what is ur grade");
		int year = input.nextInt();
		if (gpa == 3.5 && year == 12) {
			System.out.println("you graduate with honors");
		}
		else {
			System.out.println("you didnt graduate with honors");
		}
	}

}
