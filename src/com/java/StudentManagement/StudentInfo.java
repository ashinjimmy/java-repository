package com.java.StudentManagement;

 class StudentInfo {

	private int studentId;
	private String name, address;
	private double cgpa;
	
	
	/**
	 * @param studentId
	 * @param name
	 * @param address
	 * @param cgpa
	 */
	public StudentInfo(int studentId, String name, String address, double cgpa) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.address = address;
		this.cgpa = cgpa;
	}
	
	
	
	
	


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StudentInfo [studentId=" + studentId + ", name=" + name + ", address=" + address + ", cgpa=" + cgpa
				+ "]";
	}







	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}


	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
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
	 * @return the cgpa
	 */
	public double getCgpa() {
		return cgpa;
	}


	/**
	 * @param cgpa the cgpa to set
	 */
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	
	
	
}
