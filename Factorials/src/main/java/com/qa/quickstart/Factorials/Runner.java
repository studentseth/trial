package com.qa.quickstart.Factorials;

public class Runner {

	public static void main(String[] args) {
		Factorials factorial = new Factorials(); //Creating an instance of Factorials class so we can use methods in the Factorials class.
		Factorials factorial2 = new Factorials();
		
		factorial.factorialCalculator(10);
		factorial2.factorialCalculator(20);
		factorial.factorialCalculator(5); // Calling factorialCalculator method from Factorials class.
		System.out.println(factorial.factorialCalculator(5)); //To print out the value

		factorial.reverseFactorialCalculator(120);
		factorial.reverseFactorialCalculator(150);
	}

}
