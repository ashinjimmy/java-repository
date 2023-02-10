package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		System.out.println("************* ARRAYLIST **************");
		
         List<Integer> arrayList = new ArrayList<>();
         
         for (int i = 0; i < 5; i++) {
			arrayList.add(i);
		}
		
         System.out.println("ArrayList elements ---- "+arrayList);
         arrayList.remove(2);
         System.out.println("Modified ArrayList elements are ---- "+arrayList);
         
         
         for(int listElements : arrayList) {
        	 System.out.print(listElements+" ");
         }
	}

}
