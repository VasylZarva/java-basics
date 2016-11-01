package com.epom.oop.hwInterf;

/**
 * @author Vasyl Zarva.
 */
public class Triangle implements Shape {
	private final double w, h, r;

	public Triangle(double w, double h, double r) {
		this.w = w;
		this.h = h;
		this.r = r;
	}

	public void getName() {
		System.out.println("Triangle");
	}

	@Override
	public double countSquare() {
		return w * h / 2;
	}

	@Override
	public void draw() {
		System.out.println("Triangle");
	}

}
