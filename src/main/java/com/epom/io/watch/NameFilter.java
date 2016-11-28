package com.epom.io.watch;

import java.io.File;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author Vasyl Zarva.
 */
public class NameFilter {

	Set<String> names = new HashSet<>();
	Set<String> extensions = new HashSet<>();



	public Set<String> getNames() {
		return names;
	}

	public void setNames(Set<String> names) {
		this.names = names;
	}

	public Set<String> getExtensions() {
		return extensions;
	}

	public void setExtensions(Set<String> extensions) {
		this.extensions = extensions;
	}
}
