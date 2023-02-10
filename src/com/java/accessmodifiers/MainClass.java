package com.java.accessmodifiers;

public class MainClass {

	public static void main(String[] args) {
		TestPublic t = new TestPublic();
		t.display();

		TestDefault t1 = new TestDefault();
		t1.defaultMethod();

		TestPrivate t2 = new TestPrivate();

	}
}
