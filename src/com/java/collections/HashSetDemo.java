package com.java.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		System.out.println("***** HASHSET *****");

		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Red");
		hashSet.add(null);
		hashSet.add("Yellow");
		hashSet.add("Blue");
		hashSet.add("Green");
		hashSet.add("Purple");
		Boolean b1 = hashSet.add("Orange");
		System.out.println("b1 =  " + b1);
		Boolean b2 = hashSet.add("Orange");
		System.out.println("b2 =  " + b2);
		
		Boolean isBlue = hashSet.contains("Blue");
		System.out.println("Is the colour Blue contains in the Set -- "+isBlue);
		Boolean isBlack = hashSet.contains("Black");
		System.out.println("Is the colour Blue contains in the Set -- "+isBlack);

		System.out.println("\nElements of Hashset -- " + hashSet);

		System.out.println("\n---- Normal Iterator iteration  --- ");
		Iterator<String> items = hashSet.iterator();
		while (items.hasNext()) {
			String elements = (String) items.next();
			System.out.print(elements+" ");
		}

		System.out.println("\n\n---- Enhanced for loop iteration  --- ");
		for (String item : hashSet) {
			System.out.print(item+" ");
		}

	}
}
