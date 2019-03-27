package Arrays;
import java.util.Random;
public class MultiDimentional {

	public static void main(String[] args) {
		Random random = new Random();
		int[][] randomArray = new int[13][8];
		int min= 0;
		int max= 100; 
		for(int rows = 0; rows<randomArray.length; rows++) {
			for(int col = 0; col< randomArray[0].length; col++) {
				randomArray[rows][col] =  min + random.nextInt(max - min + 1);
			}
		}
		for(int rows = 0; rows<randomArray.length; rows++) {
			for(int col = 0; col< randomArray[0].length; col++) {
				System.out.println(randomArray[rows][col]);
			}
		}
		
		
	}
}
