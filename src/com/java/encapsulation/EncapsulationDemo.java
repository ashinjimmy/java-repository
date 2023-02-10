package com.java.encapsulation;

public class EncapsulationDemo {
	
	public static void main(String[] args) {
		
		EmployeeData ed = new EmployeeData("Ashin", 12300, 65000, "Finance");
		System.out.println("Employee name is -- "+ed.name);
		ed.name = "Rahul";
		System.out.println("New Employee name is  --- "+ed.name);
		
		System.out.println("--------------------");
		
		System.out.println("Employee salary is --- "+ed.getSalary());
		ed.setSalary(72000);
		System.out.println("Revised employee salary is --- "+ed.getSalary());
	}

}
