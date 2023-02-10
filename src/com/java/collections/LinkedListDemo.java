package com.java.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		System.out.println("******* LINKEDLIST ********");

		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("Apple");
		linkedList.add("Apple");
		linkedList.add("Orange");
		linkedList.add(null);
		linkedList.add("Orange");
		System.out.println(linkedList);
		
		linkedList.addFirst("Banana");
		linkedList.addLast("Mango");
		System.out.println(linkedList);
		
		linkedList.remove();
		System.out.println(linkedList);

	}

}
