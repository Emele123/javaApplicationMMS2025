import java.util.Scanner;

public class FullRegistrationSystem{
	
    public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		
		
        System.out.print(" Enter name: ");
		String name = scan.nextLine();
		
		System.out.print(" Enter age: ");
		int age = scan.nextInt();
		
		System.out.print(" Enter Street: ");
		String street = scan.nextLine();
		
		
		System.out.println("");
		
		
		System.out.print(" Enter CGPA: ");
		double cgpa = scan.nextDouble();
		
		
		System.out.printf(" Hello %s, how are you%n", name);
		System.out.printf(" you are %d years old%n", age);
		System.out.printf(" What is the name of your %s",street);
		System.out.printf(" Your cgpa is %.2f%n", cgpa);
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}