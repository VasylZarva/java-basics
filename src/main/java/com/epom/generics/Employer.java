package com.epom.generics;

import java.io.Serializable;

/**
 * @author Vasyl Zarva.
 */
public class Employer implements MyInterface, Serializable {

	private static final long serialVersionUID = 8572111019991541039L;

	private String firstName;
	private String lastName;
	private int age;

	public Employer(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return (firstName != null ? firstName : "(No First Name)")
				+ (lastName != null ? lastName : "(No Last name)") ;
	}
}
