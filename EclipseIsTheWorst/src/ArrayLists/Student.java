package ArrayLists;

import java.util.Random;

public class Student {
	private int age;
	private int[] DiceResults;
	private String name;
	private int score;

	public Student() {
	}

	public Student(int ageX) {
		age = ageX;
	}

	public Student(String xName, int xScore) {
		name = xName;
		score = xScore;
	}

	public int returnScore() {
		return score;
	}

	public String returnName() {
		return name;
	}

	public void setName(String xname) {
		name = xname;
	}

	public int[] RollaDie(int numRolls, int min, int max) {
		DiceResults = new int[numRolls];
		Random random = new Random();
		for (int i = 0; i < DiceResults.length; i++) {
			DiceResults[i] = min + random.nextInt(max - min + 1);
		}
		return DiceResults;
	}
}
