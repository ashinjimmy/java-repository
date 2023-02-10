package com.java.classdemo;

public class StudentManagement {
	
	String name;
	int age;
	String address;
	

	
	public StudentManagement(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}
	
	



	public static void main(String[] args) {
		
		StudentManagement st = new StudentManagement("Ashin", 26, "Alappatt House");
		// StudentManagement st = new StudentManagement();
		st.setAge(27);
		System.out.println(st.getName());
		System.out.println(st.getAge());
		System.out.println(st.getAddress());
		
	}

}
