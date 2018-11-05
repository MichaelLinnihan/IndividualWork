package Decision;
import java.util.Scanner;
public class Grade {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("first grade");
		int one = input.nextInt();
		System.out.println("second grade");
		int two = input.nextInt();
		System.out.println("third grade");
		int three = input.nextInt();
		System.out.println("did you do extra credit");
		boolean extra = input.nextBoolean();
		if (extra == true) {
			System.out.println("how much extra credit");
			int ex = input.nextInt();
			one = ex + one; 
			
		}
		System.out.println((one + two + three)/3);
		
	}

}
