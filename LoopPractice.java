import java.util.Scanner;

public class LoopPractice{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		
		int i = 1;
		while (i <= 21) {
			System.out.printf("Greetings to Mercy Ben %d%n", i);
		    i++;
			
			
			System.out.print(" Enter your gender (M/F): ");
			char gender = scan.next().charAt(0);
			
			System.out.println(" Your gender is" + gender);
			
			
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
}