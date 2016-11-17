package com.epom.recursion;

/**
 * @author Vasyl Zarva.
 */
public class Recursion {

	public static void main(String[] args) {
		decrementToZero(100);
	}

	private static int decrementToZero(int value) {
		if (value <= 0)
			return 0;

		System.out.println(value);
		return decrementToZero(--value);
	}
}
