package com.epom.oop.hw3;

import java.util.Calendar;

/**
 * @author Vasyl Zarva.
 */
public class Main {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();

		calendar.add(Calendar.YEAR, 1);
		calendar.set(Calendar.MONTH, 0);
		calendar.set(Calendar.DAY_OF_YEAR, 0);
		calendar.set(Calendar.DAY_OF_MONTH, 0);

		int maxMonthAmount = calendar.getActualMaximum(Calendar.MONTH);
		int monthCount = 1;
		while (monthCount <= maxMonthAmount) {

			int maxDaysInMoth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
			System.out.println("month : " + monthCount + " days : " + maxDaysInMoth);

			monthCount++;
			calendar.add(Calendar.MONTH, 1);
		}
	}
}
