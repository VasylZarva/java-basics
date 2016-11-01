package com.epom.oop.hwAbs;

/**
 * @author Vasyl Zarva.
 */
public class FixedRateEmployee extends Employee  {
	protected final String name;
	private final double monthRate;

	public FixedRateEmployee(String name, double monthRate) {
		this.name = name;
		this.monthRate = monthRate;
	}

	public String getName() {
		return name;
	}

	public double getMonthRate() {
		return monthRate;
	}

	@Override
	public double salary() {
		return monthRate;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder(this.getClass().getSimpleName());
		sb.append("[name=").append(name);
		sb.append(", monthRate=").append(monthRate);
		sb.append(", salary=").append(salary());
		sb.append(']');
		return sb.toString();
	}
}
