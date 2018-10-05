package mathExamples;

import java.util.Scanner;

public class Speeding {
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
			double speedLimit = input.nextDouble();
			double driverSpeed = input.nextDouble();
			double fine = (driverSpeed - speedLimit-1)*40+55;
			System.out.println(fine);
	
	
		
	}

}
