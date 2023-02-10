package com.java.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComaparableDemo {

	public static void main(String[] args) {

		ArrayList<StudentInfo> list = new ArrayList<>();

		StudentInfo o1 = new StudentInfo(106, "Tom", "Flat no. 7892, Kochi ",22);
		StudentInfo o2 = new StudentInfo(435, "George", "Street No. 21, Banglore",21);
		StudentInfo o3 = new StudentInfo(204, "Ram", "Flat no. 3494, Calicut",23);

		list.add(o1);
		list.add(o2);
		list.add(o3);

		Collections.sort(list); // sorting based on roll number

		System.out.println("List of students based on natural sorting-- ");
		list.stream().forEach(student -> System.out.println(student));
		System.out.println();
		
		Collections.sort(list, new AgeComparator()); // Customized sorting based on age
		
		System.out.println("List of students based on sorting age descending order");
		list.stream().forEach(student -> System.out.println(student));
		
		

//		for (StudentInfo studentInfo : list) {
//			System.out.println(studentInfo);
//		}
	}

}
