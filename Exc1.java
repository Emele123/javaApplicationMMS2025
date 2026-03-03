import java.util.Scanner;

public class Exc1{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter your first name: ");
		String name = input.nextLine();
		
		System.out.print(" Enter your age: ");
		int age = input.nextInt();
		
		System.out.print(" Enter your height: ");
		double height = input.nextDouble();

		System.out.printf(" Hello %s%n", name);
		System.out.printf(" You are %d years old%n", age);
		System.out.printf(" and you are %.2f ft tall%n", height);
		
		System.out.println("");
		
		System.out.print(" Enter first number: ");
		int num1 = input.nextInt();
		
		System.out.print(" Enter second number: ");
		int num2 = input.nextInt();
		 
		 int sum = num1 + num2;
		 
		 System.out.printf(" The total sum of %d and %d is %d%n",num1, num2, sum);
		
		System.out.println("");
		
		System.out.print(" Are you are student? (true/false): ");
		boolean student = input.nextBoolean();
		
		System.out.printf(" Your answer is %b%n", student);
		
		
		System.out.println("");
		
		System.out.print(" Enter length: ");
		double length = input.nextDouble();
		
		System.out.print(" Enter width: ");
		 double width = input.nextDouble();
		 
		 double area = length * width;
		 double perimeter =(length + width);
		 
		 System.out.printf(" The area and perimeter of rectangle is %.2f%n", perimeter);
		 
		 System.out.println("");
		 
		 
		 System.out.print(" Account balance: ");
		 double accountBalance = input.nextDouble();
		 
		 System.out.print(" Deposit amount: ");
		 double amountDeposited = input.nextDouble();
		 
		 double newBalance = ( accountBalance + amountDeposited);
		 
		 System.out.printf(" Hi %s%n", name);
		 System.out.printf(" Your new balance is %.2f%n",newBalance);
		 
		 System.out.println("");
		 
		 System.out.print(" Enter a number: ");
		 int number = input.nextInt();
		 if (number %2 == 0){
			 System.out.println(" The number is even");
		 } else {
			 System.out.println(" The number is odd");
		 }	 
	
	      System.out.println("");
		  
		 System.out.print(" Enter your score: ");
		 
		 int mark = input.nextInt();
		 if (mark >= 70){
			 System.out.printf(" Hello %s your mark is %d and your grade is (A) Exllenet %n", name, mark);
		 } 
		 else if (mark >= 60){
			 System.out.printf(" Hello %s your mark is %d and your grade is (B) Very good %n", name, mark);
         }
		 else if (mark >= 50){
			 System.out.printf(" Hello %s your mark is %d and your grade is (C) Good%n", name, mark);
	     }
		 else if (mark >= 45){
			 System.out.printf(" Hello %s your mark is %d and your grade is (D)Pass %n", name, mark);
		 }	 
		 else if (mark >= 40){
			 System.out.printf(" Hello %s your mark is %d and your grade is (E)Fair %n", name, mark);
	     }
	     else {
			 System.out.printf(" Hello %s your mark is %d and your grade is (F) Fail%n", name, mark);
			 
		 }
		 
		 
		// Age difference of children
		 
		
		
		
		
		
		
	
	
}
	
	
}