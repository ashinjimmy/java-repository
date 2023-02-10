package com.java.constructors;

public class ConstructorChainingThis {
	// Java program to illustrate Constructor Chaining
	// within same class Using this() keyword
	
	int val;
	String var;

	public ConstructorChainingThis(String var) {
		this(10);
		this.var =  var;
		System.out.println("String parameterised constructor ");
	}

	public ConstructorChainingThis(int val) {
		this();
		this.val = val;
		System.out.println("Integer parameterised constructor ");
	}

	public ConstructorChainingThis() {
		System.out.println("Default constructor");
	}

	public static void main(String[] args) {
		System.out .println("------------ CONSTRUCTOR CHAINING USING THIS KEYWORD ---------");
		ConstructorChainingThis con = new ConstructorChainingThis("Data"); // Constructor call 
		System.out.println(con.val);
		
	}

}
