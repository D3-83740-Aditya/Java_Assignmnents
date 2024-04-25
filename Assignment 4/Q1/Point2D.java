package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	private double x, y;

	public Point2D() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of x : ");
		double x = sc.nextDouble();
		System.out.println("Enter value of y : ");
		double y = sc.nextDouble();
		this.x = x;
		this.y = y;
	}

	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getDetails() {
		String s1 = String.valueOf(x);
		String s2 = String.valueOf(y);
		System.out.println("String x = " + s1);
		System.out.println("String y = " + s2);
		return null;
	}

	public void getPointDetails(Point2D p1) {
		if (p1.getX() == this.x && p1.getY() == this.y) {
			System.out.println("Points are equal.");
		} else {
			System.out.println("Distance: " + calculateDistance(p1));
		}
	}

	public boolean isEqual(Point2D p2) {
		if (x == p2.x && y == p2.y)
			return true;
		else
			return false;
	}

	public double calculateDistance(Point2D p1) {

		double d = Math.sqrt(Math.pow((p1.getX() - this.x), 2) + Math.pow((p1.getY() - this.y), 2));

		return d;

	}
}
