package com.epom.strng;

/**
 * @author Vasyl Zarva.
 */
public class Examples {
	public static void main(String[] args) {
		final char[] ch = {'a', 'b', 'c'};
		final String s = new String(ch);

		final String s1 = "abc";
		final String s2 = new String("abc");

		final String str = "Jalskdf asdfkasdf asdfaabc, rJtgh dasf fasdkf, jmt dlf,";


		if(str.matches("J.*")){
			System.out.println("String Starts with J");
		}
	}
}
