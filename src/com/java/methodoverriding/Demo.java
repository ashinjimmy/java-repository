package com.java.methodoverriding;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Method overriding demo --- ");
		
		Bike bike = new Bike(60, 3);
		System.out.println("speed of the bike "+bike.speed);
		System.out.println("Gear level of the bike "+bike.gear);
		
		bike.applyBreak(10);
		System.out.println("speed of the bike after break "+bike.speed);
		
		bike.changeGear(4);
		System.out.println("Gear level of the bike "+bike.gear);
		
		bike.speedUp(20);
		System.out.println("Current speed of the bike is "+bike.speed);
		System.out.println(" ");
		
		
		
		Bike eb = new ElectricBike(40, 3, "1 Hour");
		System.out.println("Speed of E bike is "+eb.speed);
		System.out.println("Gear of E bike is "+eb.gear);
		
		ElectricBike ebs = new ElectricBike(40, 3, "1 Hour");
		System.out.println("Charging time for E bike is "+ebs.chargingTime);
		
		eb.applyBreak(5);
		System.out.println("speed of the bike after break "+eb.speed);
		
		eb.changeGear(2);
		System.out.println("Gear of E bike is "+eb.gear);
		
		ebs.chargeUp("2 Hours");
		System.out.println("Charging bike duration -- "+ebs.chargingTime);
		
		
		
	}
}
