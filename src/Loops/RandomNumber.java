package Loops;
import java.util.Scanner;
import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
	Random random = new Random();

	    int min = 1;
	    int max = 2;

	    int tails = 0;
	    int heads = 0;
	    
	    for(int i = 0; i <= 100000; i++) {
	        int randomNum = min + random.nextInt(max - min +1);
	        if(randomNum==1) {
	            
	            tails++;
	        }
	        else {
	            
	            heads++;
	        }
	    }
	    System.out.println("Heads: "+heads+ "Tails: "+tails);
	}
	}

