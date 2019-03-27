package ArrayLists;
import java.util.ArrayList; 
import java.util.Random;
public class rectangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Rectangle> Planes = new ArrayList<Rectangle>();
		int min = 20;
		int max = 50;
		Random x= new Random();
		for(int i = 0; i<=400; i++) {
			   int width =  min + x.nextInt(max-min + 1);
			     int length=min + x.nextInt(max-min + 1);
			    Planes.add(new Rectangle(width, length));
			
		}
		
		for(int i = Planes.size()-1; i>=0; i--) {
			Rectangle thing = Planes.get(i);
			System.out.println(thing.area());
			
			
		}
		for(int i = 0; i<=3; i++) {
			   int width =  min + x.nextInt(max-min + 1);
			     int length=min + x.nextInt(max-min + 1);
			    Planes.add(new Rectangle(width, length));
			
		}
		
		
		
		
	}
  
}
