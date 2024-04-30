package com.app.employee;

import java.util.Scanner;

public class baseSalariedCommissionEmployee extends commissionEmployee {
	private double baseSalary;

	public baseSalariedCommissionEmployee() {
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter base salary: ");
		baseSalary = sc.nextDouble();
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Salary: " + calculateSalary());
		System.out.println("----------------------------------------");
	}

	@Override
	public double calculateSalary() {
		return (baseSalary + (0.1 * baseSalary));
	}
}