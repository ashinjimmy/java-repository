package com.java.collections;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		
		System.out.println("******* STACK COLLECTION (LIFO Arrangement) ******");

		Stack<String> stack = new Stack<>();
		
		stack.add("Brazil"); // add method is from Vector class & Stack extends Vector
		stack.add("Italy");
		stack.add("Germany");
		stack.push("America"); // push method is from Stack class
		stack.push("Canada");
		stack.push("India");
		
		System.out.println("Stack elements "+stack);
		
		String topElement = stack.peek();
		System.out.println("Top element "+topElement);
		
		String removedElement =  stack.pop();
		System.out.println("Removed element "+removedElement);
		
		System.out.println("Modified Stack elements "+stack);
		
	}

}
