package ComparableInterface;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CatStart smallest = new CatStart();
		CatStart largest = new CatStart();
		CatStart[] Cats = new CatStart[100];
		for(int i = 0; i < 100; i++) {
			Cats[i] = new CatStart(20, 0, 12, 5);
		}
		for(int i = 0; i<99; i++) {
			System.out.println(Cats[i].compareTo(Cats[i+1]));	
		}
		for(int i = 0; i<99; i++) {
			if (Cats[i].compareTo(Cats[i+1]) == -1) {
				smallest  = Cats[i];
			}
		}
		System.out.println("youngest "+ smallest.getAge());
		for(int i = 0; i<99; i++) {
			if (Cats[i].compareTo(Cats[i+1]) == 1) {
				largest  = Cats[i];
			}
		}
		System.out.println("oldest "+ largest.getAge());
	}

}
