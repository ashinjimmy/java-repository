package com.java.comparable;

class StudentInfo implements Comparable<StudentInfo> {

	private int rollNumber, age;
	private String name, address;
	
	
	/**
	 * @param rollNumber
	 * @param name
	 * @param address
	 */
	public StudentInfo(int rollNumber, String name, String address, int age) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	

	@Override
	public int compareTo(StudentInfo student) {
		return this.rollNumber - student.rollNumber;
	}
	


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StudentInfo --- rollNumber = " + rollNumber + ", age = " + age + ", name = " + name + ", address = " + address
				+ "";
	}


	/**
	 * @return the rollNumber
	 */
	public int getRollNumber() {
		return rollNumber;
	}
	/**
	 * @param rollNumber the rollNumber to set
	 */
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
