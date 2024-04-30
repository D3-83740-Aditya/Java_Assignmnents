package com.app.tester;

import java.util.Scanner;

import com.app.employee.*;

public class Tester {
	public static int Menu(Scanner sc) {
		System.out.println("0. Exit.");
		System.out.println("1. Salaried employee.");
		System.out.println("2. Hourly employee.");
		System.out.println("3. Commission employee.");
		System.out.println("4. Base salaried commission employee.");
		System.out.println("Enter choice: ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		while ((choice = Menu(sc)) != 0) {
			switch (choice) {
			case 1:
				Employee s = new salariedEmployee();
				s.accept(sc);
				s.display();
				break;

			case 2:
				Employee h = new hourlyEmployee();
				h.accept(sc);
				h.display();
				break;

			case 3:
				Employee c = new commissionEmployee();
				c.accept(sc);
				c.display();
				break;

			case 4:
				Employee se = new baseSalariedCommissionEmployee();
				se.accept(sc);
				se.display();
				break;
			}

		}
	}

}
