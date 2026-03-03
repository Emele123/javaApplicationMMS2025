import java.util.Scanner;

public class Male{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		
	        System.out.print(" Enter your gender (M/F): ");
			char gender = scan.next().charAt(0);
			
			System.out.println(" Your gender is: " + gender);
		
}


}