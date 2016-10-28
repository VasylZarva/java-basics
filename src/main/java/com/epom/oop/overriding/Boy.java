package com.epom.oop.overriding;

/**
 * @author Vasyl Zarva.
 */
public class Boy extends Human {

	@Override
	public void eat() {
		System.out.println("Boy is eating");
	}

	public static void main(String args[]) throws CloneNotSupportedException {
		Boy obj = new Boy();
		obj.eat();
	}
}
