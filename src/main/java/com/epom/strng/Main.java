package com.epom.strng;

import java.util.Arrays;
import java.util.UUID;

/**
 * @author Vasyl Zarva.
 */
public class Main {

	public static void main(String[] args) {
		String str1 = "  Matviichenko Vova 1    ";

		// do something

		String str2 = "Matviichenko Vova 1";

		String str3 = new String("Matviichenko Vova 1" + "alkjds");

		System.out.println(str2.toLowerCase());
		System.out.println(str2.contains("Vov"));
		System.out.println(str2.toLowerCase().contains("vov"));

		System.out.println(str1.equals(str3));
		System.out.println(str1 == str3);

		System.out.println(str1.indexOf("Vova"));

		String[] values = str1.split(" ");
		int[] myArray = new int[5];

		System.out.println(values[0]);
		System.out.println(values[1]);

		for (final String val : values) {
			System.out.println(val);
		}
		System.out.println(str1.replaceFirst(" ", "!!!"));
		System.out.println(str1.replaceAll(" ", "##"));
		System.out.println("->" + str1 + ",_");
		System.out.println("->" + str1.trim() + "<-");

		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Mat");
		stringBuffer.append("Vov");
		stringBuffer.append("asdf");
		stringBuffer.append("ruj");
		stringBuffer.toString();

		String name = "Vova";
		String result = str1.substring(str1.indexOf(name), name.length() + str1.indexOf(name));
		System.out.println("result ---->>>" + result);

		int [][] a = new int[5][5];
		UUID.randomUUID();
		Arrays.sort(a);
	}
}
