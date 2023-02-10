package com.java.collections;

public class PriorityQueue {

	public static void main(String[] args) {
		
		System.out.println("********* PRIORITYQUEUE (FIFO)  **********");
		
		java.util.PriorityQueue<String> queue = new java.util.PriorityQueue<>();
		
		queue.add("Canada");
		queue.add("UK");
		queue.add("America");
		queue.add("Germany");
		queue.add("Denmark");
		
		System.out.println("Queue Elements -- "+queue);
		
		String headElement =  queue.peek(); // Fetch the first element
		System.out.println("Head Element -- "+headElement);
		
		System.out.println("Modified Queue Elements -- "+queue);
		
		String pollElement = queue.poll(); // Fetch the first element and remove from the list
		System.out.println("Poll element -- "+pollElement);
		
		System.out.println("Modified Queue Elements -- "+queue);
		
		String removedElement = queue.remove();
		System.out.println("Removed element -- "+removedElement);
		
		System.out.println("Modified Queue Elements -- "+queue);
		
	}
}
