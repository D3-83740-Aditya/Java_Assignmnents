package com.sunbeam;

import java.awt.geom.Point2D;

public class Circle {
	private Point2D centerPoint;
	private double diameter;

	public Circle() {
		centerPoint = new Point2D.Double(0, 0);
		diameter = 100;
	}

	public void setDiameter(double diameter) throws NegativeDiameterException {
		if (diameter < 0) {
			throw new NegativeDiameterException("Diameter cannot be negative.");
		}
		this.diameter = diameter;
	}

	public Point2D getCenterPoint() {
		return centerPoint;
	}

	public double getDiameter() {
		return diameter;
	}
}
