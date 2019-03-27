package ComparableInterface;
public class WorkerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkerStart smallest = new WorkerStart();
		WorkerStart largest = new WorkerStart();
		WorkerStart[] workers = new WorkerStart[100];
		for(int i = 0; i < 100; i++) {
			workers[i] = new WorkerStart();
		}
		for(int i = 0; i<99; i++) {
			System.out.println(workers[i].compareTo(workers[i+1]));	
		}
		for(int i = 0; i<99; i++) {
			if (workers[i].compareTo(workers[i+1]) == -1) {
				smallest  = workers[i];
			}
		}
		System.out.println("Samllest"+ smallest.getHours());
		for(int i = 0; i<99; i++) {
			if (workers[i].compareTo(workers[i+1]) == 1) {
				largest  = workers[i];
			}
		}
		System.out.println("Largest"+ largest.getHours());
	}

}
