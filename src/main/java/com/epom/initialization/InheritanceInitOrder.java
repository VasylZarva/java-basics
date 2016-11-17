package com.epom.initialization;

/**
 * @author Vasyl Zarva.
 */
public class InheritanceInitOrder {
	static class A {
		String a;
		A() {
			a = "a";
			System.out.println("a initialized");
			System.out.println("b=" + ((B)this).b);
		}
	}

	static class B extends A {
		static int index = 0;
		static {
			index = 1;
			System.out.println("static block : index=" + index);
		}
		String b;
		B() {
			b = "b";
			say();
			System.out.println("b initialized");
			System.out.println("index=" + index);
			System.out.println("b=" + b);
		}

		public static void say() {
			System.out.println("static say");
		}
	}

	public static void main(String[] args) throws ClassNotFoundException {
		new B();
	}
}
