package com.epom.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Vasyl Zarva.
 */
public class GenericMain {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {

		Employer employer = read(Employer.class, "Select first_name, last_name from employer");
	}

	public static <T> T addToCollection(T element, Collection<T> collection) {
		collection.add(element);
		return element;
	}

	public static <T> T read(Class<T> theClass, String sql)
			throws IllegalAccessException, InstantiationException {

		//execute SQL.

		T o = theClass.newInstance();
		//set properties via reflection.

		return o;
	}

}
