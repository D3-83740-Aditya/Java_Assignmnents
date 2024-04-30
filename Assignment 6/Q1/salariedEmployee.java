package com.app.employee;

import java.util.Scanner;

public class salariedEmployee extends Employee {

	private double weeklySalary;

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	public salariedEmployee() {

	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter weekly salary: ");
		weeklySalary = sc.nextDouble();
	}

//	@Override
//	public void display() {
//		super.display();
//		System.out.println("Salary: " + getWeeklySalary());
//	}

	@Override
	public void display() {
		super.display();
		System.out.println("Salary: " + calculateSalary());
		System.out.println("----------------------------------------");
	}

	@Override
	public double calculateSalary() {
		return getWeeklySalary() * 4;
	}

}
