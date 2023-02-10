package com.java.loops;

public class DoWhileLoop {

	public static void main(String[] args) {
		System.out.println("*********## Do While Loop ##*********");
		int count = 9;
		do {
			System.out.println("Iteration count --- " + count);
			count++;
		} while (count <= 10); // Here condition checked with the incremented value

	}
}

// Do while loop is used mainly used to perform some task before evaluating the conditions