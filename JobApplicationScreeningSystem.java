import java.util.Scanner;

public class JobApplicationScreeningSystem{
	public static void main(String [] args ) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print(" Enter age: ");
		int age = scan.nextInt();
		
		System.out.print(" Enter years of experience : ");
		int experience = scan.nextInt();
		
		System.out.print(" Do you have certification (True/false : ");
		boolean hasCertification = scan.nextBoolean();
		
		System.out.print(" Enter english score: ");
		int englishScore = scan.nextInt();
	
	    if(age >= 21
		&& (experience >= 3 || hasCertification)
		&& englishScore >= 60) {
			
		System.out.println("Interview sheduled");
		} else{
			System.out.println(" Application rejected");
			
		}
			
		
		 
		
		
	}

}