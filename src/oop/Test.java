package oop;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
	
		// activity 1
		Greeter bob = new Greeter();
		bob.sayHello();
		bob.sayHello();
		bob.sayHello();
		Friend john = new Friend();
		john.sayMessage();
		bob.sayHello();

		// activity 2

		Friend jenny = new Friend();
		Friend billy = new Friend();
		Friend sammy = new Friend();
		Friend kyle = new Friend();
		billy.sayMessage();
		kyle.sayMessage();

		// numbers parameters
		Numbers qwe = new Numbers();
		qwe.sayNumber(8);
		qwe.plusTwo(5);
		qwe.sumOf(2, 3);
		qwe.squareOf(2);
		qwe.areaOf(4, 2);
		qwe.roundUp(6.6);
		

		// sandbox one 
		House rew = new House();
		rew.one();
		//sandbox two 
		Scanner input = new Scanner(System.in);
		System.out.println("width");
		double width = input.nextDouble();
		System.out.println("length");
		double length = input.nextDouble();
		System.out.println("depth");
		double depth = input.nextDouble();
		System.out.println("rate");
		double rate = input.nextDouble();
		double volume = length *width *depth;
		rew.two(volume, rate);
		rew.three(volume, rate);
		
		Greeter tre = new Greeter();
		tre.setAge(4);
		//employee object
		Employee bobby = new Employee();
		bobby.setWage(4);
		bobby.getWage();
		bobby.setLevel(1);
		bobby.getLevel();
	
		
		
		 
		
		
		

	}

}
