package ArrayLists;
import java.util.Scanner;
import java.util.ArrayList;
public class ForEach {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("how many students?");
		int num = input.nextInt();
		ArrayList<Integer> ages = new ArrayList<Integer>();
		for(int i =0; i<num; i++) {
			System.out.println("age?");
			int age = input.nextInt();
			ages.add(age);
		}
		for(int i : ages) {
			System.out.println(ages.get(i));
		}
	}
}
