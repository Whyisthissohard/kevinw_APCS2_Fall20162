import java.util.*;

public class Collab {
	public static void main(String [] args){
		
		
		System.out.print("Enter in 15 numbers.");
		Scanner userInput = new Scanner(System.in);
		 
		int nums = userInput.nextInt();
		int sum = 0;
		int min = userInput.nextInt();
		int max = min;
		nums = userInput.nextInt();
		sum += nums;
		
			
		System.out.println(sum);
		System.out.println(min + max);	
	}
}
