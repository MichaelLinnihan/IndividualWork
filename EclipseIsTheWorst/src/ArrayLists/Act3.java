package ArrayLists;
import java.util.ArrayList;
import java.util.Scanner;
public class Act3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> arrayListName = new ArrayList<String>();
		arrayListName.add("bob");
		arrayListName.add("jane");
		arrayListName.add("billy");
		System.out.println("what is your name");
		arrayListName.add(input.nextLine());
		for(int i = 0; i<arrayListName.size(); i++) {
			System.out.println(arrayListName.get(i));
		}
	}
}
