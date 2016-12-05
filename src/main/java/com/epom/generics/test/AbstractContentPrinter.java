package com.epom.generics.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.epom.generics.Employer;

/**
 * @author Vasyl Zarva.
 */
public abstract class AbstractContentPrinter<MyType> {

	private List<MyType> CONTENT_HOLDER = new ArrayList<>();

	public List<MyType> getContent() {
		return CONTENT_HOLDER;
	}

	public void setContent(List<MyType> content) {
		if (content == null) {
			CONTENT_HOLDER.clear();
		}

		this.CONTENT_HOLDER = content;
	}

	protected void print() {
		System.out.println("Print content");
		for (MyType type : CONTENT_HOLDER)
			System.out.println("-> " + type.toString());
	}
}
