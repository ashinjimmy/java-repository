package com.java.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamIterator {

	public static void main(String[] args) {
		System.out.println("------ STREAM ITERATOR -------");
		
		List<String> languageList =new ArrayList<>();
		languageList.add("PYTHON");
		languageList.add("BASIC");
		languageList.add("JAVA");
		languageList.add("C");
		
		languageList.stream().forEach(s -> System.out.println(s));
	}
}
