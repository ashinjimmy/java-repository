package com.java.interfaces;

public class MotorBike implements TwoWheeler {
	
	private int speed, gear,seatLevel;


	/**
	 * @param speed
	 * @param gear
	 * @param seatLevel
	 */
	public MotorBike(int speed, int gear, int seatLevel) {
		this.speed = speed;
		this.gear = gear;
		this.seatLevel = seatLevel;
	}
	

	@Override
	public void applyBreak() {
		speed -= speed; // bring to zero
	}

	@Override
	public void speedUp(int speed) {
		System.out.println("speed -- "+speed);
		this.speed += speed; // raise the speed
	}
	
	
	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}


	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}


	/**
	 * @return the gear
	 */
	public int getGear() {
		return gear;
	}


	/**
	 * @param gear the gear to set
	 */
	public void setGear(int gear) {
		this.gear = gear;
	}


	/**
	 * @return the seatLevel
	 */
	public int getSeatLevel() {
		return seatLevel;
	}


	/**
	 * @param seatLevel the seatLevel to set
	 */
	public void setSeatLevel(int seatLevel) {
		this.seatLevel = seatLevel;
	}

}
