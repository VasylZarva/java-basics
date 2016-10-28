package com.epom.oop.abstr;

/**
 * @author Vasyl Zarva.
 */
public abstract class AbstractPet {

	public AbstractPet() {
	}
	public AbstractPet(String name) {
		System.out.println("AbstractPet " + name);
	}

	abstract String getType();

	public void fallASleep() {
		System.out.println("I went to bed");
	}
}
