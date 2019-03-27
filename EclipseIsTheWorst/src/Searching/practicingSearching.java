package Searching;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class practicingSearching {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		//ArrayList<Integer> scores =  new ArrayList<Integer>();
		int[] rando= new int[100];
		Scanner input = new Scanner(System.in);
		int min = 0;
		int max= 499;
		System.out.println("what your number");
		int userNum = input.nextInt();
	
		for(int i = 0; i<100; i++) {
			int r = min + random.nextInt(max - min + 1);
			rando[i]= r;
				
		}
		
	
		int buggers = 0;
		for(int i= 0;i<rando.length; i++ ) {
			if(rando[i]==userNum){
				buggers++;
				break;
			}
		}
		System.out.println(buggers);
		
		
		
		

	}


}
