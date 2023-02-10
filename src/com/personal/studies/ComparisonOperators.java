package com.personal.studies;

public class ComparisonOperators {
	
	public static void main(String[] args) {
		
		int val1 = 1, val2 = 2;
		
		ifCondtion(val1,val2); // Checks each line of condition and prints for each right one
		
		ifElseIfCondition(val1, val2); // checks each line of conditions until it evaluate right and comes out.
		
	}

	

	private static void ifCondtion(int val1, int val2) {
		if(val1 == val2) 
			System.out.println("val1 == val2");
		
		if(val1 > val2)
			System.out.println("val1 > val2");
		
		if(val1 >= val2)
			System.out.println("val1 >= val2");
		
		if(val1 < val2)
			System.out.println("val1 < val2");
		
		if(val1 <= val2)
			System.out.println("val1 <= val2");
		
		if(val1 != val2)
			System.out.println("val1 != val2");
		
	}
	
	private static void ifElseIfCondition(int val1, int val2) {
		
		if(val1 == val2) 
			System.out.println("val1 == val2");
		
		else if(val1 > val2)
			System.out.println("val1 > val2");
		
		else if(val1 >= val2)
			System.out.println("val1 >= val2");
		
		else if(val1 < val2)
			System.out.println("val1 < val2");
		
		else if(val1 <= val2)
			System.out.println("val1 <= val2");
		
		else if(val1 != val2)
			System.out.println("val1 != val2");
		
		else 
			 System.out.println("Out of range !!!");
		
	}

}
