package com.java.abstraction;

public class Circle extends GeometricObject {

	@Override
	public void draw() {
	   System.out.println("Draw Circle");
	}

	@Override
	void resize() {
		System.out.println("Resize Circle");
	}

}
