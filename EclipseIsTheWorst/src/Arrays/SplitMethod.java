package Arrays;
import java.util.Scanner;
public class SplitMethod {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sent = input.nextLine();
		String[] words = sent.split(" ");
		int numKeyWord = 0;
		for(int i = 0; i< words.length; i++) {
			System.out.println(words[i]);
		}
		System.out.println("what word");
		String keyWord = input.nextLine();
		for(int i = 0; i<words.length; i++) {
		
			if(words[i].contains(keyWord) == true) {
				numKeyWord ++;
			}
		}
		System.out.println(numKeyWord);
	}
}
