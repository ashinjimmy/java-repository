package com.personal.studies;

public class UnaryOperator {

	public static void main(String[] args) {

		int i = 3;

		i++; // Assign the value and then increment it (PostIncrement)

		System.out.println(i); // 4

		++i;  // Increment the value and then assign it  (PreIncrement)

		System.out.println(i); // 5

		System.out.println(++i); //6
		
		System.out.println(i); // 6

		System.out.println(i++); //6
		
		System.out.println(i); // 7

	}

}
