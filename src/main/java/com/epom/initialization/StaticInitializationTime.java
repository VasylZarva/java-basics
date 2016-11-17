package com.epom.initialization;

/**
 * @author Vasyl Zarva.
 */
public class StaticInitializationTime {
	public static class C {
		static int i = value();
		static int value() {
			System.out.println("C.i initialized");
			return 1;
		}
	}

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("Before class loading");
		System.out.println(C.class.getName());
		Class.forName(C.class.getName());
		System.out.println("After class loading");
	}
}
