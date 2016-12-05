package com.epom.generics.test;

import java.io.Serializable;
import java.util.Collection;

import com.epom.generics.MyInterface;

/**
 * @author Vasyl Zarva.
 */
public class PrinterUtil {

	private PrinterUtil() {
		throw new SecurityException();
	}

	public static <T> T getFirstFromCollection(Collection<T> collection) {
		if (collection == null || collection.isEmpty())
			return null;

		return collection.iterator().next();
	}

	public static <T> T addToCollection(T element, Collection<T> collection) {
		collection.add(element);
		return element;
	}

	public static <T extends MyInterface> T addMyElement(T element, Collection<T> collection) {
		collection.add(element);
		return element;
	}
}
