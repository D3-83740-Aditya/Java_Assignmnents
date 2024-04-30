package com.app.employee;

import java.util.Scanner;

public class hourlyEmployee extends Employee {

	private double wage;
	private int hrs;

	public hourlyEmployee() {

	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter wage: ");
		wage = sc.nextDouble();
		System.out.println("Enter hours: ");
		hrs = sc.nextInt();
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Salary: " + calculateSalary());
		System.out.println("----------------------------------------");
	}

	@Override
	public double calculateSalary() {
		if (hrs <= 40) {
			return wage * hrs;
		} else
			return (1.5) * wage * hrs;
	}
}
