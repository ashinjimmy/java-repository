package com.java.constructors;

public class MultipleConstructor {

	int width, length, height;

	/**
	 * @param width
	 * @param length
	 * @param height
	 */
	public MultipleConstructor(int width, int length, int height) {
		super();
		this.width = width;
		this.length = length;
		this.height = height;
	}

	/**
	 * @param width
	 * @param length
	 * @param height
	 */
	public MultipleConstructor(int width, int length) {
		this.width = width;
		this.length = length;
		this.height = 10;
	}

	/**
	 * @param width
	 * @param length
	 * @param height
	 */
	public MultipleConstructor(int dimension) {
		this.width = dimension;
		this.length = dimension;
		this.height = dimension;

	}

	/**
	 * @param width
	 * @param length
	 * @param height
	 */
	public MultipleConstructor() {
		this.width = 10;
		this.length = 6;
		this.height = 3;

	}
	
	


	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

//	Method to calculate and return the volume 
	public int volume() {
		return width * height * length;
	}
	

	public static void main(String[] args) {

		System.out.println(" Multiple Constructors --- ");

		MultipleConstructor fullyParamCon = new MultipleConstructor(100, 30, 20);
		int v1 =  fullyParamCon.volume();
		System.out.println("Volume val for fully param con -- "+v1);
		System.out.println("Width val -- "+fullyParamCon.getWidth());
		
		MultipleConstructor twoParamCon = new MultipleConstructor(100, 30);
		int v2 =  twoParamCon.volume();
		System.out.println("Volume val for two param con -- "+v2);
		
		MultipleConstructor oneParamCon = new MultipleConstructor(10);
		System.out.println("Width val -- "+oneParamCon.getWidth());
		oneParamCon.setWidth(2); // Update the width value even after initialized with 10
		int v3 =  oneParamCon.volume();
		System.out.println("Volume val for one param con -- "+v3);
		
		MultipleConstructor emptyParamCon = new MultipleConstructor();
		int v4 =  emptyParamCon.volume();
		System.out.println("Volume val for empty param con -- "+v4);
		

	}
}
