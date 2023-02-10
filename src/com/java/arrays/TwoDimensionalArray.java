/**
 * 
 */
package com.java.arrays;

import java.sql.Array;

/**
 * @author Ashin
 * @version 1
 *
 */
public class TwoDimensionalArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 4, 5, 6 }, { 7, 8, 9 } };
//		System.out.println("Array Length --- "+arr.length);
//		System.out.println("First Row length--- "+arr[0].length);
//		System.out.println("First Column of first row "+ arr[0][0]);

		for (int i = 0; i < arr.length; i++) {
//			     System.out.println("Row elements --- "+arr[i]); // memory address of each row
			for (int j = 0; j < arr[i].length; j++) {
				// System.out.println("Values --- "+i+" row and "+j+" column element is "+
				// arr[i][j]);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
