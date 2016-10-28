package com.epom.basics;

/**
 * @author Vasyl Zarva.
 */
public class User {
	private String name;
	private String classRooom;

	public static boolean ACTIVE = getValue();

	static {
		ACTIVE = getValue();
	}

	public static boolean getValue() {
		return true;
	}

	public String getName() {
		pringMyName();
		return name;

	}

	public void setName(String name) {
		this.name = name;
	}

	public void pringMyName() {
		System.out.println("my name is " + getName());
	}
}
