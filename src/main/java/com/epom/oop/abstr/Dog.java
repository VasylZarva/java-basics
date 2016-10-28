package com.epom.oop.abstr;

/**
 * @author Vasyl Zarva.
 */
public class Dog extends AbstractPet implements Pet {

	int age;
	String name;

	public Dog() {
		super("from dog");
	}

	public Dog(int age) {
		// validate age
		this.age = age;

		System.out.println("Constructor called with value " + age);
	}

	public Dog(String name) {
		// validate age
		System.out.println("Constructor called with value " + age);
	}
	public Dog(int age, String name) {
		this(age);
		// validate name
		System.out.println("Constructor called with value " + age);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	String getType() {
		return "Dog";
	}

	@Override
	public void say() {
		System.out.println(getType() + " bark");
	}
}
