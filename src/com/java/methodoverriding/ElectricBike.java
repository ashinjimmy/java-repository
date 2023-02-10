package com.java.methodoverriding;

public class ElectricBike extends Bike {

	public String chargingTime;

	public ElectricBike(int speed, int gear, String chargingTime) {
		super(speed, gear);
		this.chargingTime = chargingTime;
	}

	@Override
	public void speedUp(int value) {
		speed += value + 1;
	}
	
	@Override
	public void applyBreak(int value) {
		speed = speed-value-5  ;
	}

	public void chargeUp(String duration) {
		chargingTime = duration;
	}

}
