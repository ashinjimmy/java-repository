package com.java.arrays;

public class Array {
	public static void main(String[] args) {
		
		int[] integerArray = new int[4]; 
		
		integerArray[0] = 133;
		integerArray[1] = 550;
		integerArray[2] = 450;
		integerArray[3] = 564;
		
		System.out.println("Integer array --- "+integerArray); // [I@15db9742 - Memory address
		
		for (int i = 0; i < integerArray.length; i++) {
			System.out.println("Iteration index "+i+" Value ---- "+integerArray[i]);
		}
		
	}

}
