package com.java.user.inputs;

import java.util.Scanner;

public class EmployeeInfo {

	public static void main(String[] args) {
		
		System.out.println("---------- REGISTER NEW EMPLOYEE DETAILS ---------- ");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nEnter the employee id = ");
		int empId = input.nextInt();
		
		System.out.println("Enter the employee name = ");
		String empName = input.next();
		
		System.out.println("Enter the depart of the employee = ");
		String dept = input.next();
		
		System.out.println("Enter the salary of the employee");
		double salary = input.nextDouble();
		
		
		System.out.println("\n---------------------------------");
		System.out.println("     EMPLOYEE INFORMATION   ");
		System.out.println("---------------------------------");
		System.out.println("\nEmployee id is "+empId);
		System.out.println("Employee name is "+empName);
		System.out.println("Employee salary is "+salary);
		System.out.println("Employee department is "+dept);
		
		
	}
	
}
