package com.app.geometry;

import java.util.Scanner;

public class Point2D {

	public static void main(String[] args) {

		class _point2D {
			private int x, y;

//			public _point2D() {
//				Scanner sc = new Scanner(System.in);
//				System.out.println("Enter value of x : ");
//				int x = sc.nextInt();
//				System.out.println("Enter value of y : ");
//				int y = sc.nextInt();
//				this.x = x;
//				this.y = y;
//			}

			public _point2D(int x, int y) {
				this.x = x;
				this.y = y;
			}

			public int getX() {
				return x;
			}

			public void setX(int x) {
				this.x = x;
			}

			public int getY() {
				return y;
			}

			public void setY(int y) {
				this.y = y;
			}

			public String getDetails() {
				String s1 = String.valueOf(x);
				String s2 = String.valueOf(y);
				System.out.println("String x = " + s1);
				System.out.println("String y = " + s2);
				return null;
			}

			public void getPointDetails(_point2D p1) {
				if (p1.getX() == this.x && p1.getY() == this.y) {
					System.out.println("Points are equal.");
				} else {
					System.out.println("Distance: " + calculateDistance(p1));
				}

			}

			public boolean isEqual(_point2D p2) {
				if (x == p2.x && y == p2.y)
					return true;
				else
					return false;
			}

//			(int) Math.pow((p1.getX() - p2.getX()), 2) + (int) Math.pow((p1.getY() - p2.getY()), 2)
			public int calculateDistance(_point2D p1) {

				int d = (int) Math
						.sqrt((int) Math.pow((p1.getX() - this.x), 2) + (int) Math.pow((p1.getY() - this.y), 2));

				return d;
			}
		}

		_point2D p1 = new _point2D(10, 20);
		p1.getDetails();

		System.out.println("-------------------------------------------");

		_point2D p2 = new _point2D(10, 20);
		_point2D p3 = new _point2D(10, 50);

		System.out.println("P1 = P2: " + p1.isEqual(p2));
		System.out.println("P1 = P3: " + p1.isEqual(p3));

		System.out.println("-------------------------------------------");

		_point2D p4 = new _point2D(65, 50);

		System.out.println("Distance of P1 to P2: " + p1.calculateDistance(p2));
		System.out.println("Distance of P2 to P3: " + p2.calculateDistance(p3));

		System.out.println("-------------------------------------------");

		p1.getPointDetails(p2);
		p4.getPointDetails(p3);
		System.out.println("-------------------------------------------");
	}
}
