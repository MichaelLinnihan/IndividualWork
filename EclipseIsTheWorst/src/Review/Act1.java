package Review;
import java.util.Random;
public class Act1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int size = 5;	
		final int max = 100;
		final int min=2;
		double avg = 0;
		double sum = 0;
		Random random = new Random();
		Circle[] circles = new Circle [size];
		for(int i = 0; i<circles.length; i++) {
			circles[i] = new Circle();
			circles[i].setRadius(min + random.nextInt(max - min + 1));
			sum = sum+circles[i].getRadius();
		}
		avg = sum/(circles.length-1);
		System.out.println("your avg radius is "+ avg);
		
		
	}

}
