package Simulation;
import java.util.Random;
public class Student {
	private int age; 
	private int[] DiceResults;
	public Student() {
	}
	public Student(int ageX) {
		age = ageX;
	}
	public int[] RollaDie(int numRolls, int min, int max) {
		DiceResults = new int[numRolls];
		Random random = new Random();
		for(int i = 0; i<DiceResults.length;i++) {
			DiceResults[i] =  min + random.nextInt(max - min + 1);
		}
		return DiceResults;
	}
}
