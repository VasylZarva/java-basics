package com.epom.services;

import java.io.Serializable;

/**
 * @author Vasyl Zarva.
 */
public class User implements Serializable {
	private static final long serialVersionUID = -8936119259393030161L;

	private long id;

	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
