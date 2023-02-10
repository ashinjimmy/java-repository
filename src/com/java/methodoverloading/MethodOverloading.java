package com.java.methodoverloading;

public class MethodOverloading {
	
	static int multiply(int x, int y) {
		return x*y;
	}
	
	
	 int multiply(int x, int y, int z) {
		return x*y*z;
	}
	
	 double multiply(double x, double y) {
		return x*y;
	}

	public static void main(String[] args) {
		System.out.println("Method Overloading -------");
		System.out.println(multiply(10,2));
		MethodOverloading mo = new MethodOverloading();
		System.out.println(mo.multiply(10,2,4));
		System.out.println(mo.multiply(10.9,2.0));
	}
}
