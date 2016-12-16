package com.epom.concurrent.main;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Vasyl Zarva.
 */
public class Counter {

//	private int count = 0;

	private AtomicInteger counter = new AtomicInteger(0);

	public void increment() {
		counter.incrementAndGet();
	}

	public int getCurrentCount() {
		return counter.get();
	}
}
