package com.app.tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {
	public static int Menu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter choice: ");
		int ch = sc.nextInt();

		return ch;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter no of points to plot: ");
		int no = sc.nextInt();

		Point2D[] points = new Point2D[no];

		for (int i = 0; i < points.length; i++) {

			points[i] = new Point2D();
		}

		int choice;

		while ((choice = Menu()) != 4) {
			switch (choice) {

			case 1:
				System.out.print("Enter index to see point details: ");
				int i = sc.nextInt();
				if (i < 0 || i > points.length) {
					System.out.println("Invalid index, please try again.");

				} else {
					System.out.print("Point P(x,y): " + points[i].getX() + ", " + points[i].getY());
				}
				System.out.println();
				break;

			case 2:
				System.out.println("X and Y cordinates of all points are as follows:");
				for (int i1 = 0; i1 < points.length; i1++) {
					System.out.println("X = " + points[i1].getX() + ", Y = " + points[i1].getY());
				}
				System.out.println();
				break;
			case 3:
				System.out.println("Enter 2 indices for the points: ");
				System.out.print("Index 1: ");
				int i1 = sc.nextInt();
				System.out.print("Index 2: ");
				int i2 = sc.nextInt();

				if (points[i1].getX() == points[i2].getX() && points[i1].getY() == points[i2].getY()) {
					System.out.println("Distance is zero.");
				} else {
					System.out.println("Distance is " + points[i1].calculateDistance(points[i2]));
				}
				break;

			default:
				break;
			}
		}

	}
}
