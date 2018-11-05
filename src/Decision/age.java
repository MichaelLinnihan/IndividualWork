package Decision;
import java.util.Scanner;
public class age {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		if(age<=17) {
			System.out.println("your getting an A");
		}
	}
}
