package com.epom.oop.inheritance;

/**
 * @author Vasyl Zarva.
 */
public class Inheritance {

	public static void main(String[] args) {
		Child child = new Child();

		child.grandGrandHello();
		child.grandHello();
		child.childHello();
	}
}
