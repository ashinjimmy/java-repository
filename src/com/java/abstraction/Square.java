package com.java.abstraction;

public class Square extends GeometricObject {

	@Override
	public void draw() {
		System.out.println("Draw Square");
	}

	@Override
	void resize() {
	    System.out.println("Resize Square");
	}

}
