package com.java.collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		System.out.println("******** TREESET ******");
 
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("z");
		treeSet.add("Z");
		treeSet.add("V");
		treeSet.add("A");
		treeSet.add("a");
		treeSet.add("J");
		treeSet.add("2");
		treeSet.add("V");
		
		System.out.println(treeSet);
	
	}

}
