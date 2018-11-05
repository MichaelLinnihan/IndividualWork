package Decision;
import java.util.Scanner;
public class Prize {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double money = input.nextDouble();
		final double close = 0.001;
		if (Math.abs(money-Math.sqrt(84.3))< close){
			System.out.println("good prize");
		}
		else {
			System.out.println("");
		}
	}
	
}
