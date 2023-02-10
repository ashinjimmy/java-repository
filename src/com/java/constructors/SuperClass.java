package com.java.constructors;

public class SuperClass {

	int superClassVal;

	public SuperClass(int superClassVal) {
		this("Data ------");
		this.superClassVal = superClassVal;
		System.out.println("superClassVal == " + superClassVal);
	}

	public SuperClass(String string) {
		System.out.println(string);
	}

}
