public class PrimitiveDataType {

    public static void main(String[] args) {
		// whole number primitive data type
		byte age = 30;
	    System.out.printf(" I am %d years old%n",age);
		
		short quantityOfBags = 10000;
		System.out.printf(" The quantity of bags ordered is %d%n", quantityOfBags);
		
		int NigeriaPopulation = 2000000000;
		System.out.printf(" The population of Nigeria is %d%n", NigeriaPopulation);
		
		long WorldsPopulation = 9000000000000L;
		System.out.printf(" The World population is %d%n", NigeriaPopulation);
		
		
	    // foat-point primitive data type
		float myBalance = 6945.6000057f;
		System.out.printf(" My account balance is %.2f%n", myBalance);
		
		double cBNBalance = 9874466464.904;
		System.out.printf(" CBN account balance is %f%n", cBNBalance);
	
		
		// single character primitive data type
		char symbol = '$';
		System.out.printf(" My Account balance is %c%.2f%n", symbol,myBalance);
		System.out.printf(" My Account balance is %c%f%n", symbol, cBNBalance);
		
		// Boolean data type
		
		boolean myJava = true;
		System.out.printf(" learning java, is it difficult? %b%n", myJava);
		System.out.printf(" Do you love learning java? %b%n", myJava);
		
	    boolean isGraduate = true;
		System.out.printf(" Is Omega a graduate? %b%n", isGraduate);
		
		
	}






}