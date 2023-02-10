package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

	public static void main(String[] args) {

		System.out.println("STREAM MAP FUNCTIONALITY");

		List<Integer> arrayList = Arrays.asList(11, 20, 33, 40, 50, 60);
		System.out.println("Array List -- " + arrayList);

//		-------- NORMAL LOGIC -----------

//		ArrayList<Integer> squaredArrayList = new ArrayList<>();
//		for(Integer val : arrayList) {
//			squaredArrayList.add(val*val);
//		}
//		System.out.println("Squared Array List --- "+squaredArrayList);

//		------- STREAM MAP LOGIC -------

		List<Boolean> squaredArrayList = arrayList.stream().map(x -> (x % 2 == 0) ).collect(Collectors.toList());

		System.out.println("Squared Array List --- " + squaredArrayList);
	}

}
