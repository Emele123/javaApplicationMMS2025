public class OperatorPart1{

	public static void main(String[] args) {
		// assignment operator(=)
		int num = 50;
		System.out.printf(" The value of num is %d%n", num);
		//Arithemetic operator( +,-,*,/,%);
		
	     int num1 = 100;
		 int num2 = 500;
		
		 int sum = num1 + num2;
		 System.out.printf("The sum of %d and %d is %d%n", num1, num2, sum);
		 
		 int subtraction = num1 - num2;
		 System.out.printf(" The difference between %d and %d is %d%n", num1, num2, subtraction);
	
		 
		 int multiplication = num1 * num2;
		 System.out.printf(" The product of %d and %d is %d%n", num1,num2, multiplication);
		 
		 int quotient = num1 / num2;
		 System.out.printf(" The difference quotient of %d and %d is %d%n", num1,num2, quotient);
		 
		 int remainder = num1 % num2;
		 System.out.printf(" The remainder between %d and %d is %d%n", num1,num2, remainder);
		 
		 // compound assignment operator
		 num1 *= num2;
		 System.out.printf("The value of num1 is now %d%n", num1);
		 
		 num1 -= num2;
		 System.out.printf("The value of num1 is now %d%n", num1);
		 
		 num1 /= num2;
		 System.out.printf("The value of num1 is now %d%n", num1);
		 
		 num1 %= num2;
		 System.out.printf("The value of num1 is now %d%n", num1);
		 
		 
		 //Relational operators (>, >, >=, <, !=,==)
		 
		 int number1 = 20, number2 = 50;
		 
		 boolean isGreater = number1 > number2;
		 System.out.printf(" is %d > %d? %b%n", number1, number2, isGreater);
		  
		 
		boolean islessThan = number1 < number2;
		 System.out.printf(" is %d < %d? %b%n", number1, number2, islessThan);
		 
		 boolean isGreaterThanOrEqualTo = number1 >= number2;
		 System.out.printf(" is %d >= %d? %b%n", number1, number2, isGreaterThanOrEqualTo);
		 
		 boolean isLessThanOrEqualTo = number1 <= number2;
		 System.out.printf(" is %d <= %d? %b%n", number1, number2, isLessThanOrEqualTo);
		 
		 boolean isNotEqualTo = number1 != number2;
		 System.out.printf(" is %d != %d? %b%n", number1, number2, isNotEqualTo);
		 
		 
		 
		 boolean isEqualTo = number1 == number2;
		 System.out.printf(" is %d == %d? %b%n", number1, number2, isEqualTo);
		 
		 
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



