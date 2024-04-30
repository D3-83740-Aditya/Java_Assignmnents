package com.app.employee;

import java.util.Scanner;

public class commissionEmployee extends Employee {

	private int grossSales;
	private double commissionRate;

	public commissionEmployee() {
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter gross sales: ");
		grossSales = sc.nextInt();
		System.out.println("Enter commission rate: ");
		commissionRate = sc.nextDouble();
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Salary: " + calculateSalary());
		System.out.println("----------------------------------------");
	}

	@Override
	public double calculateSalary() {
		return 0.2 * grossSales * commissionRate;
	}
}
