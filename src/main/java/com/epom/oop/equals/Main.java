package com.epom.oop.equals;

/**
 * @author Vasyl Zarva.
 */
public class Main {

	public static void main(String[] args) {
		final Headphones headphones1 = new Headphones("1");

		final Phone phone1 = new Phone("p1", headphones1);
		final Phone phone2 = new Phone("p1", headphones1);

		System.out.println(phone1.equals(phone2));
	}
}
