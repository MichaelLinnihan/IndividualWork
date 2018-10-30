package Decision;
import java.util.Scanner;
public class Lucky {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		if (age >= 18) {
			int height= input.nextInt();
			double luckyA = height/5;
			System.out.println(luckyA);
		}
		else {
			int weight = input.nextInt();
			double luckyK = weight/2;
			System.out.println(luckyK);
		}
	}
}
