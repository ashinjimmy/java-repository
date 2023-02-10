package com.java.comparable;

import java.util.Comparator;

public class AgeComparator implements Comparator<StudentInfo> {

	@Override
	public int compare(StudentInfo student1, StudentInfo student2) {

		if (student1.getAge() < student2.getAge()) {
			return 1;
		} else if (student1.getAge() > student1.getAge()) {
			return -1;
		} else {
			return 0;
		}

	}

}
