package com.epom.services;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Vasyl Zarva.
 */
public class UserQuery {

	private final Set<Long> idsToFilter = new HashSet<Long>();

	private String nameQuery;

	public UserQuery(final String nameQuery) {
		this.nameQuery = nameQuery;
	}

	public String getNameQuery() {
		return nameQuery;
	}

	public void setNameQuery(String nameQuery) {
		this.nameQuery = nameQuery;
	}

	public void addId(long id) {
		idsToFilter.add(id);
	}

	public Set<Long> getIdsToFilter() {
		return idsToFilter;
	}

	public boolean isFilter() {
		if (!idsToFilter.isEmpty())
			return false;

		if (nameQuery == null || nameQuery.isEmpty())
			return false;

		return true;
	}
}
