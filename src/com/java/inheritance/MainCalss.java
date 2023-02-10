package com.java.inheritance;

public class MainCalss {

	public static void main(String[] args) {
		System.out.println("------INHERITANCE--------");

		SportsCar sc = new SportsCar(2, true, 30, 2);
		sc.carSeatStatus();
		sc.gearStatus();
		sc.speedStatus();
		System.out.println("Break status of the car -- "+sc.carBreak);
		sc.speedUp();
	
	}
}
