package com.java.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;

public class StreamFilter {

	public static void main(String[] args) {

		System.out.println("---- STREAM FILTER DEMO   ----");

		List<String> list = Arrays.asList("JAVA", "PYTHON", "C#", "PHP", "JAVASCRIPT");
		System.out.println("List of elements --- " + list);

		//  CONVENTIONAL METHOD
		
//		ArrayList<String> filteredList = new ArrayList<>();
//		for (String listVal : list) {
//			if (listVal.startsWith("J")) {
//				filteredList.add(listVal);
//			}
//		}
//		System.out.println("Filtered list value " + filteredList);
		
		// STREAM FILTER METHOD
		
		List<String> filteredList = list.stream().filter(s->s.startsWith("J")).map(x->x.concat(" CODING TECHNOLOGY")).collect(Collectors.toList());
		
		System.out.println(filteredList);
		
	}

}
