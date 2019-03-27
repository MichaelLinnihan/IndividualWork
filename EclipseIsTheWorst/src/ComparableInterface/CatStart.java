package ComparableInterface;
import java.util.Random; 
public class CatStart implements Comparable<CatStart> {
	private int age;
	private int sleep;
	private Random random = new Random();
	public CatStart()
	{
	age = 1;
	sleep = 12;
	}

	public CatStart(int MaxAge, int MinAge , int MaxSleep, int MinSleep)
	{ 
	age =MinAge + random.nextInt(MaxAge  - MinAge + 1);
	sleep = MinSleep + random.nextInt(MaxSleep  - MinSleep + 1);; 
	}
	public int compareTo(CatStart temp) {
		if( age == temp.getAge()) {
			return 0;
	
		}
		if(age > temp.getAge()) {
			return 1;
		
		}
		return -1;

	}

	public int getAge()
	{
	return age;
	}

	public int getSleep()
	{
	return sleep;
	}

	public void setAge(int xAge)
	{
	age = xAge;
	}

	public void setSleep(int xSleep)
	{
	sleep = xSleep;
	}

	public void birthday()
	{
	age++;
	}

	public void sleepMore()
	{
	sleep++;
	}

	public void sleepless()
	{
	sleep--;
	}
}
