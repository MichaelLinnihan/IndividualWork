package mathExamples;

import java.util.Scanner;

public class BussesVans {
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("how many people");
		int numP= input.nextInt();
		int numBus = numP/35;
		int numVan = numP%35;
		System.out.println(numBus);
		System.out.println(numVan);
	
	
		
	

}

}
