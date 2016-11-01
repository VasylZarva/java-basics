package com.epom.oop.hwAbs;

import java.util.Calendar;

/**
 * @author Vasyl Zarva.
 */
public class HourlyRateEmployee extends Employee  {

	private String name;
	private double hourRate;

	public HourlyRateEmployee(String name, double hourRate) {
		this.name = name;
		this.hourRate = hourRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHourRate() {
		return hourRate;
	}

	public void setHourRate(double hourRate) {
		this.hourRate = hourRate;
	}

	@Override
	public double salary() {
		return countWorkingDays() * HOURS_IN_DAY * hourRate;
	}

	private int countWorkingDays() {
		final Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, 0);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);

		int daysInCurrentMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

		int workingDaysCount = 0;
		while (daysInCurrentMonth-- > 0) {
			int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
			if (dayOfWeek != Calendar.SATURDAY && dayOfWeek != Calendar.SUNDAY) {
				workingDaysCount++;
			}
			calendar.add(Calendar.DAY_OF_YEAR, 1);
		}
		return workingDaysCount;
	}


	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder(this.getClass().getSimpleName());
		sb.append("[name=").append(name);
		sb.append(", hourRate=").append(hourRate);
		sb.append(", salary=").append(salary());
		sb.append(']');
		return sb.toString();
	}
}
