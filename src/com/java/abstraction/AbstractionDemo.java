package com.java.abstraction;

public class AbstractionDemo {

	public static void main(String[] args) {

		Circle circle = new Circle();
		circle.draw();
		circle.resize();
		circle.z = 11;
		System.out.println(circle.z);

		System.out.println("---------------------------");

		GeometricObject square = new Square();
		square.draw();
		square.resize();
		square.setX(90);
		System.out.println(square.getX());

	}

}
