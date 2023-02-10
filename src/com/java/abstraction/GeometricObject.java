package com.java.abstraction;

public abstract class GeometricObject {

	private int x, y; // Encapsulation -- to manipulate this need to use getter & setter methods
	int z;

	 // Abstract class cannot instantiate but can have user defined constructor
	public GeometricObject() {
		System.out.println("Calling base class");
	}

	public abstract void draw();

	abstract void resize();

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
}
