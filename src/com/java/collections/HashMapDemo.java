package com.java.collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		System.out.println("****** HASHMAP  ****");

		HashMap<String, Integer> hashMap = new java.util.HashMap<>();
		hashMap.put("Englis", 70);
		hashMap.put("Maths", 76);
		hashMap.put("Physics", 78);
		hashMap.put("Chemistry", 82);
		hashMap.put("Computer Science", 76);
		
		System.out.println("HashMap elements --- "+hashMap);
		
		if(hashMap.containsKey("Maths")) {
			int marks = hashMap.get("Maths");
			System.out.println("Marks obtained for Maths is -- "+marks);
		}
		
		System.out.println("\n Iteration using key set");
		for(String key : hashMap.keySet()) {
			System.out.println("Subject  : "+key+" ---  Marks obtained : "+hashMap.get(key));
		}
		
		System.out.println("\n Iteration using entry set");
		
		for(Entry<String, Integer> map : hashMap.entrySet()) {
			System.out.println("Subject : "+map.getKey()+" -- Marks obtained : "+map.getValue());
		}
		
	}

}
