package com.java.loops;

public class NestedForLoop {

	public static void main(String[] args) {

		char[][] items = { {'a','A','b','B'}, {'c','C','d','D'} };
		
		for (int i = 0; i < items.length; i++) {
			for (int j = 0; j < items[i].length; j++) {
				System.out.print(items[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
