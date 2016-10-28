package com.epom.oop.abstr;

/**
 * @author Vasyl Zarva.
 */
public class Main {
	public static void main(String[] args) {
		getPet().say();

		final Dog dog = new Dog();
		Cat cat = new Cat("barsik");
		Cat cat2 = new Cat("epomchik");
		cat = cat2;
		dog.fallASleep();
		cat.fallASleep();

		EpomDog epomDog = new EpomDog();
		epomDog.getPizduley();

		System.out.println(cat.toString());;
		System.out.println(cat2.toString());;

		System.out.println(cat.getClass());
	}

	public static Pet getPet() {
		return new Dog();
	}
}
