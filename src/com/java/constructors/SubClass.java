package com.java.constructors;

public class SubClass extends SuperClass {

	int val;

	public SubClass(int val) {
		this();
		this.val = val;
		System.out.println("Parameterised constructor of Subclass ---");
	}

	public SubClass() {
//	Constructor call -- Calling constructor of super class
		super(10);
	}

	public static void main(String[] args) {
		System.err.println("---------- CONSTRUCTOR CHAINING USING SUPER KEYWORD  ---------");
		SubClass sb = new SubClass(100);

	}
}
