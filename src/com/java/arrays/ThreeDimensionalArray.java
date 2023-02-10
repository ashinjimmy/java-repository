package com.java.arrays;

public class ThreeDimensionalArray {
	
	public static void main(String[] args) {
		
		int[][][] arr = { { {1,2,3}, {4,5,6} }, { {0,5,6}, {5,7,9} } };
		
		System.out.println(arr[0][0][1]);
		System.out.println("Main array length -- "+arr.length);
		System.out.println("array length -- "+arr[0].length);
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
	

}
