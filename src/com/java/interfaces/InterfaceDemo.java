package com.java.interfaces;

public class InterfaceDemo {

	public static void main(String[] args) {
		
		MotorBike motorBike = new MotorBike(70, 4, 3);
		
		System.out.println("Seat level -- "+motorBike.getSeatLevel());
		motorBike.setSeatLevel(4);
		System.out.println("Seat level adjusted to -- "+motorBike.getSeatLevel());
		
		System.out.println("Gear level of the motor bike -- "+motorBike.getGear());
		
		System.out.println("Current speed of the motor bike is -- "+motorBike.getSpeed());
		motorBike.applyBreak();
		System.out.println("Speed of the motor bike after break  is --- "+motorBike.getSpeed());
		motorBike.setGear(1);
		System.out.println("Gear level is "+motorBike.getGear());
		motorBike.speedUp(20);
		System.out.println("Speed of the motor bike after acceleration -- "+motorBike.getSpeed());
	}
}
