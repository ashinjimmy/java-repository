package com.java.recursion;

class FactorialOfNumber {

	int factorial(int n) {

		if (n == 1) {
			return 1;
		} else {
			return (n * factorial(n - 1));
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("Factorial of 5 is "+ new FactorialOfNumber().factorial(5));
	}
}
