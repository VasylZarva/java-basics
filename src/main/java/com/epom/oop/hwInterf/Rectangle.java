package com.epom.oop.hwInterf;

/**
 * @author Vasyl Zarva.
 */
public class Rectangle implements Shape {

	private final int height;
	private final int width;

	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	@Override
	public double countSquare() {
		return height * width;
	}

	@Override
	public void draw() {
		System.out.println("Rectangle");
	}
}
