package com.epom.oop.hwInterf;

/**
 * @author Vasyl Zarva.
 */
public class Main {

	public static void main(String[] args) {
		printShape(new Triangle(1D, 2D, 3D));
		printShape(new Rectangle(1, 2));
	}

	public static void printShape(final Shape shape) {
		shape.draw();
		System.out.println(shape.countSquare());

		if (shape instanceof Triangle) {
			Triangle triangle = (Triangle) shape;
			triangle.getName();
		}
		if (shape instanceof Rectangle) {
			Rectangle rectangle = (Rectangle) shape;
			rectangle.getHeight();
			rectangle.getWidth();
		}

	}
}
