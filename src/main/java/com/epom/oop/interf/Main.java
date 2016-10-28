package com.epom.oop.interf;

/**
 * @author Vasyl Zarva.
 */
public class Main {

	public static void main(String[] args) {
		getRetriever().retrieve();
	}

	public static Retriever getRetriever() {
		return new BaseRetrieverImpl();
	}
}
