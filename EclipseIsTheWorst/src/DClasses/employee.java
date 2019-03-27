package DClasses;
import java.util.Random;
public class employee {
	private String name;
	private double r;
	private double[] hw;
	private static int eNum;
	final int min = 0;
	final int max = 40;
	Random random = new Random();
	public employee() {
		name ="John Smith";
		r =10;
		for(int i = 0; i<52; i++) {
			hw[i]=  min + random.nextInt(max - min + 1);
		}
		eNum++;
	}
	
	
	
	
}
