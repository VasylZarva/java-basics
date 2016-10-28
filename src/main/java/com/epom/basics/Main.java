package com.epom.basics;

/**
 * @author Vasyl Zarva.
 */
public class Main {

	static {

	}

	public static void main(String[] args) {

		User user = new User();
		User user1 = new User();
		User user2 = new User();

		boolean age = User.getValue();
		;
		System.out.println("end of main");

		System.out.println( MathUtil.add(3, 4) );
	}
}
