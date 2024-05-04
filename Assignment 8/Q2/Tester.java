package com.tester;

import java.util.Scanner;

import com.sunbeam.*;

public class Tester {

	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println("Default diameter: " + circle.getDiameter());

		try {
			Scanner sc = new Scanner(System.in);
			double d = sc.nextDouble();
			sc.close();
			circle.setDiameter(d);
		} catch (NegativeDiameterException e) {
//			System.out.println("Error: " + e.getMessage());
			System.out.println("Error: " + e);
		}
		System.out.println("Updated diameter: " + circle.getDiameter());
	}

}
