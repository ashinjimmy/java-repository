package com.java.accessmodifiers;

public class TestPrivate {

	private void displayPrivbate() {
		System.out.println("Private Access Modifier.");
	}

	public static void main(String[] args) {
		TestPrivate tp = new TestPrivate();
		tp.displayPrivbate();

	}

}
