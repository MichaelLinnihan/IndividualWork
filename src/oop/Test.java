package oop;

public class Test {
	public static void main(String [] args) {	
		//activity 1
		Greeter bob = new Greeter();
		bob.sayHello();
		bob.sayHello();
		bob.sayHello();
		Friend john = new Friend();
		john.sayMessage();
		bob.sayHello();
		
		//activity 2

		Friend jenny = new Friend();
		Friend billy = new Friend();
		Friend sammy = new Friend();
		Friend kyle = new Friend();
		billy.sayMessage();
		kyle.sayMessage();
		
		//numbers parameters
		Numbers qwe = new Numbers();
		qwe.sayNumber(8);
		qwe.plusTwo(5);
		qwe.sumOf(2, 3);
}

}
