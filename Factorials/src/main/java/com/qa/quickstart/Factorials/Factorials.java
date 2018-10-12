package com.qa.quickstart.Factorials;

public class Factorials {
	
	public int factorialCalculator(int num) {
		int result = 1;
		// For loop runs num times
		for (int j = 1; j <= num; j++) {
			result = result * j;
		}
		return result;
	}

	public int reverseFactorialCalculator(int num) {
		int result = 0;
		for (int j = 1; j <= num; j++) {
			if (factorialCalculator(j) == num) {
				result = j;
				System.out.println(result);
				break;
			} 
			if (j == num) {
				System.out.println("NONE");
			}
		}

		return result;
	}
}
