package com.epom.oop.hwAbs;

/**
 * @author Vasyl Zarva.
 */
public class Main {


	public static void main(String[] args) {
		FixedRateEmployee kostya = new FixedRateEmployee("Kostya", 90000D);
		ChildFixedRateEmployee vova = new ChildFixedRateEmployee("Vova", 666D);

		HourlyRateEmployee xz = new HourlyRateEmployee("xz", 12.3D);

		// DO SOME WORK : START
		// END

		System.out.println(kostya);
		System.out.println(vova);
		System.out.println(xz);
	}

}



