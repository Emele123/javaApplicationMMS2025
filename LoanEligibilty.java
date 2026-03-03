import java.util.Scanner;

public class LoanEligibilty{
	public static void main(String [] args ) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print(" Enter age: ");
		int age = scan.nextInt();
		
		System.out.print(" Enter salary : ");
		int salary = scan.nextInt();
		
		System.out.print(" Enter credit score: ");
		int credit_score = scan.nextInt();
	
		
		if(age >= 21 && salary >= 50000 && credit_score >= 650)
			System.out.println(" loan approved");
		}else{
			System.out.println("Declined");
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

	
	
}