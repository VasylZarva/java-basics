package com.epom.oop.interf;

/**
 * @author Vasyl Zarva.
 */
public class BaseRetrieverImpl implements Retriever, Cloneable {

	@Override
	public void retrieve() {
		System.out.println("retrieve Base.");
	}
}
