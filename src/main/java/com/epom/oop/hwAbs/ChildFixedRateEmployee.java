package com.epom.oop.hwAbs;

/**
 * @author Vasyl Zarva.
 */
public class ChildFixedRateEmployee extends FixedRateEmployee {

	public ChildFixedRateEmployee(String name, double monthRate) {
		super(name, monthRate);
	}

	@Override
	public double getMonthRate() {
		return super.getMonthRate() + 1;
	}


	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder(this.getClass().getSimpleName());
		sb.append("[").append(super.toString());
		sb.append(']');
		return sb.toString();
	}

}
