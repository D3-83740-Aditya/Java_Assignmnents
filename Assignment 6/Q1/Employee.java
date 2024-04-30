package com.app.employee;

import java.util.Scanner;

public abstract class Employee {
	private String firstName, lastName;
	private int emp_id;

	public Employee() {

	}

	public void accept(Scanner sc) {
		System.out.println("Enter first name: ");
		firstName = sc.next();

		System.out.println("Enter last name: ");
		lastName = sc.next();

		System.out.println("Enter employee id: ");
		emp_id = sc.nextInt();
	}

	public void display() {
		System.out.println();
		System.out.println("Full name: " + (firstName + " " + lastName));
		System.out.println("Employee id: " + emp_id);
	}

	public abstract double calculateSalary();

}
