package com.epom.oop.abstr;

/**
 * @author Vasyl Zarva.
 */
public class Cat extends AbstractPet implements Pet, Cloneable {

	private String name;

	public Cat() {
	}

	public Cat(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;

	}

	@Override
	String getType() {
		return "Cat";
	}

	@Override
	public void say() {
		System.out.println(getType() + " may");
	}

	@Override
	public String toString() {
		return getName();
	}
}
