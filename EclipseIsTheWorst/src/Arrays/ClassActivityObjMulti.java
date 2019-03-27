package Arrays;
import java.util.Scanner;
public class ClassActivityObjMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] names = new String[3][2];
		Scanner input = new Scanner(System.in);
		for(int row= 0; row < names.length; row++) {
			for(int col = 0; col<names[0].length; col++) {
				System.out.println("whats the name");
				names[row][col]= input.nextLine();
			}
		}
		for(int row= 0; row < names.length; row++) {
			for(int col = 0; col<names[0].length; col++) {
				System.out.println("whats the name");
				System.out.println(names[row][col]);
			}
		}
	}

}
