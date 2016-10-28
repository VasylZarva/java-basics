package com.epom.oop.polymorphism;

/**
 * @author Vasyl Zarva.
 */
public class MethodOverloading {

	public static void main (String args []) {
		final Overload overload = new Overload();
		double result;
		overload.demo(10);
		overload.demo(10, 20);
		result = overload.demo(5.5);
		System.out.println("O/P : " + result);
	}
}
