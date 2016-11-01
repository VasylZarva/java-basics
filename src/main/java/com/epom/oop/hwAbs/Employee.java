package com.epom.oop.hwAbs;

/**
 * @author Vasyl Zarva.
 */
public abstract class Employee {

	protected static final int HOURS_IN_DAY = 8;

	public abstract double salary();

	public final String getCompanyName() {
		return "unknown";
	}
}
