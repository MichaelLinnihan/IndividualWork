package ArrayLists;
import java.util.ArrayList;
import java.util.Scanner;
public class Act1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<String> arrayListName = new ArrayList<String>();
		arrayListName.add("bob");
		arrayListName.add("jane");
		arrayListName.add(1,"billy");
		System.out.println("whats your name");
		arrayListName.add(input.nextLine());
		
		ArrayList<Plane> fleet = new ArrayList<Plane>();
		fleet.add(0, new Plane("e", 4, 4));
		fleet.add(0, new Plane("r", 4,4));
		fleet.add(0, new Plane("q", 4,4));
		for(int i = 0; i<fleet.size(); i++) {
			fleet.get(i);
		}
		
	}

}
