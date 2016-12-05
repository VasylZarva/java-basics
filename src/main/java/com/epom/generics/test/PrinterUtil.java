package com.epom.generics.test;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

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

	public static <Value extends MyInterface> Value addToMap(Value element, Map<Long, Value> map) {
		map.put(element.getId(), element);
		return element;
	}

	public static <Key extends Long, Value extends MyInterface> Value getByKey(Key key, Map<Key, Value> map) {
		return map.get(key);
	}

	public static <Key extends Long, Value extends MyInterface> void printNames(Map<Key, Value> map) {
		map.entrySet().stream()
		   .forEach(e -> System.out.println("key=" + e.getKey() + ", id=" + e.getValue().getId()));
	}
}
