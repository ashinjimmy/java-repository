package com.java.StudentManagement;

public class AcademicUpdate {

	public static void main(String[] args) {
		
		System.out.println("Student's Academic Details ...... ");
		StudentInfo s1 = new StudentInfo(1003, "Willam" , "Baveria, Germany", 2.5);
        System.out.println("Student name "+s1.getName());
        s1.setCgpa(3);
        System.out.println("Student cgpa "+s1.getCgpa());
        
        StudentInfo s2 = registerNewInfo (s1);
        
        System.out.println("student name "+s2.getName());
        
        System.out.println(s1);//compiler writes here s1.toString()  
        System.out.println(s2);//compiler writes here s2.toString()  
        
        
	}


	
	private static StudentInfo registerNewInfo(StudentInfo si) {
		StudentInfo student = new StudentInfo(1997,"Mark", si.getAddress(), si.getCgpa());
		return student;
	}

}
