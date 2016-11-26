package com.epom.io.test;

import java.io.IOException;
import java.io.StringWriter;

/**
 * @author Vasyl Zarva.
 */
public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("start");
		System.err.println("error message");
		System.out.println("--------");
		int i = System.in.read();
		System.out.println("entered : " + i);
	}
}
