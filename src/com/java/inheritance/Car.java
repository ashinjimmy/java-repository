package com.java.inheritance;

class Car {

	protected int carGear, carSpeed;
	protected Boolean carBreak;
	protected String gearVal;

	/**
	 * @param carGear
	 * @param carBreak
	 * @param carSpeed
	 */
	protected Car(int carGear, Boolean carBreak, int carSpeed) {
		this.carGear = carGear;
		this.carBreak = carBreak;
		this.carSpeed = carSpeed;
	}

	protected void speedStatus() {
		if (carBreak) {
			this.carSpeed = carSpeed - 5;
			System.out.println("Car is running at a speed of " + carSpeed + " KMH");
		}
	}
	
	protected void speedUp() {
		if (!carBreak) {
			this.carSpeed = carSpeed + 5;
			System.out.println("Car is running at a speed of " + carSpeed + " KMH ");
		}
	}


	protected void gearStatus() {

		switch (carGear) {

		case 1:
			gearVal = "First";
			break;
		case 2:
			gearVal = "Second";
			break;
		case 3:
			gearVal = "Third";
			break;
		case 4:
			gearVal = "Fourth";
			break;
		default:
			System.out.println("Car is in Neutal State");
		}

		System.out.println("Car is running in the " + gearVal + " gear");

	}

}
