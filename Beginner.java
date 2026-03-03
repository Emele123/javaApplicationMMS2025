import java.util.Scanner;
 
 public class Beginner{
	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 // Telling user for name and age
		 System.out.print(" Enter your name: ");
		 String name = scan.nextLine();
		 
		 System.out.print(" Enter your age: ");
		 int age = scan.nextInt();
		 
		
		 System.out.printf(" Hello %s", name);
		 System.out.printf(" you are %d, years old%n", age);
		 
		
		 System.out.println("");
		 System.out.println("");
		  
		 
		 // Adding two numbers
		 System.out.print(" Enter first number: ");
		 int num1 = scan.nextInt();
		 
		 System.out.print(" Enter Second number: ");
		 int num2 = scan.nextInt();
		 
		 int sum = num1 + num2; 
		 
		 System.out.printf(" The sum is %d%n", sum);
		
		 System.out.println("");
		 System.out.println("");
		  
		// Ask for account balance
		System.out.print(" Enter your account balance: ");
		double balance = scan.nextDouble();
		
		System.out.printf(" Your balance is %.2f%n", balance);
		
		//Ask user Name
		System.out.print(" Are you a student? ( true or false): ");
		boolean student = scan.nextBoolean();
		
		System.out.printf(" Student status: %b%n", student);
		 
		 System.out.println("");
		 System.out.println("");
		 
		 // length and width
		 
		 
		 System.out.print(" Enter length: ");
		 double length = scan.nextDouble();
		 
		 System.out.print(" Enter width: ");
		 double width = scan.nextDouble();
		
		double area = length * width;
		
		System.out.printf(" Area = %.2f%n", area);
		
		 System.out.println("");
		 System.out.println("");
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 }
	 
	 
	 
	 
	 
	 
	 
 }
 