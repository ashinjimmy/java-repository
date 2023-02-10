 package com.java.inheritance;

 class SportsCar extends Car {
	
	int carSeatCount;
	
	protected SportsCar(int carGear, Boolean carBreak, int carSpeed, int carSeatCount) {
		super(carGear, carBreak, carSpeed);
		this.carSeatCount = carSeatCount;
	}

	void carSeatStatus() {
		System.out.println("The Car has "+carSeatCount+" Seats");
	}
	

}
