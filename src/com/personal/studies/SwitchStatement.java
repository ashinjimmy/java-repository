package com.personal.studies;

public class SwitchStatement {

	public static void main(String[] args) {
		
		int monthValue = 3;
		String month = null;
		
		switch (monthValue) {
		case 1:
			month = "JAN";
			break;
		
		case 2:
			month = "FEB";
			break;
			
		case 3:
			month = "MAR";
			break;
			

		default:
			month = "Invalid Month";
			break;
		}
		
		System.out.println("The selected month is ----- "+month);
		
	}
}
