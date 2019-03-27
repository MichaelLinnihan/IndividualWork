package Arrays;

import java.util.Random;

public class MultiDimSumInClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int sum =0;
		int[][] randomArray = new int[2][6];
		int min= 0;
		int max= 100; 
		for(int rows = 0; rows<randomArray.length; rows++) {
			for(int col = 0; col< randomArray[0].length; col++) {
				randomArray[rows][col] =  min + random.nextInt(max - min + 1);
			}
		}
		for(int rows = 0; rows<randomArray.length; rows++) {
			for(int col = 0; col< randomArray[0].length; col++) {
				sum += randomArray[rows][col];
			}
		}
		System.out.println(sum);
	}

}
