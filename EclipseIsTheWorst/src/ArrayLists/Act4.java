package ArrayLists;
import java.util.Scanner;
import java.util.ArrayList;
public class Act4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("how many employees?");
		int num = input.nextInt();
		ArrayList<Integer> wages = new ArrayList<Integer>();
		for(int i =0; i<num; i++) {
			System.out.println("wage?");
			int wage = input.nextInt();
			wages.add(wage);
		}
		for(int i :wages ) {
			
		}
	}

}
