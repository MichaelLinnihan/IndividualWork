package oop;

public class Employee {
	private double wage;
	private int level; 
	public Employee() {
		
	}
	
	public double getWage() {
		return wage;
	}
	public void setWage(double wageX) {
		wage = wageX;
	}
	public int getLevel() {
		return level;
		
	}
	public void setLevel(int levelX) {
		level = levelX;
	}
	public void raise() {
		wage = wage * 1.1;
	}

}
