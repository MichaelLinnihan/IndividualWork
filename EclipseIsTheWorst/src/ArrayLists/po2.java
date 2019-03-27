package ArrayLists;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class po2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		ArrayList<Student> algebra = new ArrayList<Student>();
		System.out.println("how many students are there?");
		int largestScore = 0;
		int largest = 0; 
		int smallestScore= 9999;
		int smallest = 9999999;
		int numStudents = input.nextInt();
		for(int i = 0; i < numStudents; i++) {
			System.out.println("what score did student number " + (i+1)+ " get");
			int xscore = input.nextInt();
			System.out.println("what is their name?");
			String xname = input.next();
			algebra.add(new Student(xname, xscore));
		}
		
		
		for(int i = 0; i<= algebra.size()-1; i++) {
			if(algebra.get(i).returnScore()<= smallestScore) {
				smallestScore = algebra.get(i).returnScore();
				smallest = i;
			}
			if(algebra.get(i).returnScore()>=largestScore) {
				largestScore = algebra.get(i).returnScore();
				largest = i;
			}
		}
		System.out.println(algebra.get(largest).returnName());
		System.out.println(algebra.get(smallest).returnName());
		
		
	}

}
