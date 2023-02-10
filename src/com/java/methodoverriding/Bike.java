package com.java.methodoverriding;

public class Bike {
	
	protected int speed;
	protected int gear;
	
	/**
	 * @param speed
	 * @param gear
	 */
	public Bike(int speed, int gear) {
		this.speed = speed;
		this.gear = gear;
	}
	
	
	public void speedUp(int value) {
		speed += value;
	}
	
	public void changeGear(int gear) {
		this.gear = gear;
	}
	
	public void applyBreak(int value) {
		speed -= value;
	}
	

}
