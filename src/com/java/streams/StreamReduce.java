package com.java.streams;

import java.util.Arrays;
import java.util.List;

public class StreamReduce {

	public static void main(String[] args) {
		System.out.println("---- STREAM REDUCE METHOD ----");
		
		List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		System.out.println("List of numbers - "+numberList);
		
		int sum = numberList.stream().filter(x -> (x % 2 == 1)).reduce(0, (ans,o) -> ans + o);
		System.out.println("Sum of the even numbers -- "+sum);
	}
}
