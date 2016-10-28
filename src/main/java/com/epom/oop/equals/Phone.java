package com.epom.oop.equals;

/**
 * @author Vasyl Zarva.
 */
public class Phone {

	private String model;

	private Headphones headphones;

	public Phone(String model, Headphones headphones) {
		this.model = model;
		this.headphones = headphones;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Headphones getHeadphones() {
		return headphones;
	}

	public void setHeadphones(Headphones headphones) {
		this.headphones = headphones;
	}
}
