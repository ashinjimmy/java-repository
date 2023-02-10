package com.java.constructors;

public class DefaultConstructor {
	
	int width, height, depth; // Properties of the class which is globally declared
	
	public int volume() {
		return width*height*depth;
	}

//	public DefaultConstructor() { // User created default constructor
//		this.width = 10;
//		this.height = 10;
//		this.depth = 3;
//	}

	public static void main(String[] args) {
		
		System.out.println("Default Constructor Demo ...... ");
		
//	JAVA provides a default constructor if the user is not provided one
//  If the user provides a constructor with at least one parameter along with 
//	the JAVA's default constructor then the default constructor won't work,
//	the user has to provide a default constructor explicitly	
		
		
		DefaultConstructor con = new DefaultConstructor(); // Default constructor call
		int volume = con.volume();
		System.out.println("Value of the volume is ----- "+volume);
		
		
	}
	
}
