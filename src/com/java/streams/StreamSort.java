package com.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSort {

	public static void main(String[] args) {
		System.out.println("------ STREAM SORT METHOD ------");
		
		List<String> languageList = new ArrayList<>();
		languageList.add("PYTHON");
		languageList.add("BASIC");
		languageList.add("JAVA");
		languageList.add("C");
		
		System.out.println("Language list -- "+languageList);
		
		List<String> sortedList = languageList.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted language set -- "+sortedList);
	}
}
