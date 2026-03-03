import java.util.Scanner;
public class PraticalClass{
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print(" Enter your name: ");
		String myName = scan.nextLine();


	    System.out.print(" Enter your age: ");
	    int age = scan.nextInt();
	   
	    System.out.printf(" Hello %s how are you %n", myName);
	    System.out.printf(" You are %d years old%n", age);
		
		System.out.println("");
		
		// addition of two numbers
		System.out.print(" Enter first number: ");
		int num1 = scan.nextInt();
		  
		System.out.print(" Enter second number: ");
		int num2 = scan.nextInt();
		
		int sum = num1 + num2;
		
		System.out.printf(" sum of %d and %d is %d%n", num1,num2, sum);
		
		System.out.println("");
		
		// subtration of two numbers
		System.out.print(" Enter first number: ");
		int number1 = scan.nextInt();
		  
		System.out.print(" Enter second number: ");
		int number2 = scan.nextInt();
		
		int value = number1 - number2;
		
		System.out.printf(" The value of %d and %d is %d%n", number1,number2, value);
		
		System.out.println("");
		
		
		// Multiply two decimal numbers
		
		System.out.print(" Enter first decimal: ");
		double a = scan.nextDouble();
		
		System.out.print(" Enter second decimal: ");
		double b = scan.nextDouble();
		double result = a * b;
		
		System.out.printf("Result: %.2f%n", result);
		
		// Multiply two divide numbers
		
		System.out.print(" Enter numerator: ");
		double c = scan.nextDouble();
		
		System.out.print(" Enter denominator: ");
		double d = scan.nextDouble();
		double inResult= c/ d;
		
		System.out.printf("Result: %.3f%n", inResult );
		
		System.out.println("");
		
		System.out.print("Enter a number: ");
		int inNum = scan.nextInt();
		if (inNum %2 == 0){
		   System.out.println("The number is Even");
		}else{ 
		   System.out.println(" The number is Odd");
		   
		   
		   // Voting Eligiblity
		   
		   System.out.print( " Enter your year: ");
		   int inAge = scan.nextInt();
		   
		   if (inAge >= 18){
			   System.out.printf(" At age %d, you are eligible to vote. %n", inAge);
		   } else {
			   System.out.printf(" At %d you are not eligible to vote. %n", inAge);
			   
			   
			   
			   
			   // Travelling eligibity
			   
			   
			   System.out.print(" Enter your currency: ");
			   double currency = scan.nextDouble();
			   
			    if (currency >= 10000){
					System.out.printf(" with %.2f, you are eligible to travel. %n", currency);
				} else {System.out.printf( " with %.3f, you are not eligible to vote. %n", currency);
				
				}
				
					
			   
		   }
		   
		   
		   
		   
		   
		   
		   
		   }
		
		
		
		
	}
	
	
	
	
	
	
	
}