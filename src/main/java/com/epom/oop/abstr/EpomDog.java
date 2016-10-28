package com.epom.oop.abstr;

/**
 * @author Vasyl Zarva.
 */
public class EpomDog extends Dog {

	public void getPizduley() {
		System.out.println("i'm running from Roman.");
	}

	@Override
	public void fallASleep() {
		System.out.println("I have never went to bed");
	}
}
