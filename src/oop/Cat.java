package oop;

public class Cat {
	private int age= -999; 
	private int sleep= -999; 
	public Cat(){
	}
	public void birthday () {
		age ++;	
	}
	
	public void sleepMore(int change) {
		sleep = sleep + change;
	}
	public void sleepLess(int change) {
		sleep = sleep - change;
	}

}
