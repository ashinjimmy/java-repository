package com.java.collections;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		System.out.println("****** HASHMAP ******");
		
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		treeMap.put("Red", 2);
		treeMap.put("Green", 9);
		treeMap.put("Yellow", 6);
		treeMap.put("Blue", 5);
		System.out.println(treeMap);
		
		for(String key : treeMap.keySet()) {
			System.out.println("key -- "+key+" -- value : "+treeMap.get(key));
		}
		
		System.out.println("-------------------------------");
		
		for(Entry<String,Integer> entry : treeMap.entrySet()) {
			System.out.println("Key -- "+entry.getKey()+" Value -- "+entry.getValue());
		}
		
		
	}

}
