package Searching;
import java.util.ArrayList;
import java.util.Random;
public class Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		ArrayList<Integer> scores =  new ArrayList<Integer>();
		int min = 0;
		int max= 1500;
		
		for(int i = 0; i<1000; i++) {
			int r = min + random.nextInt(max - min + 1);
			scores.add(r);
				
		}
		int score = min + random.nextInt(max - min + 1);
		boolean buggers = false;
		for(int i= 0;i<=scores.size()-1; i++ ) {
			if( scores.get(i)==score){
				buggers = true;
				break;
			}
		}
		System.out.println(buggers);
		
		
		
		

	}

}
