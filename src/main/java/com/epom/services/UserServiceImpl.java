package com.epom.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/**
 * @author Vasyl Zarva.
 */
public class UserServiceImpl implements UserService {
	/**
	 * {@link Logger} instance.
	 */
	private static final Logger LOGGER = Logger.getLogger(UserServiceImpl.class.getName());

	private final Map<Long, User> storage = new HashMap<Long, User>();

	private AtomicLong idGenerator = new AtomicLong(0);

	public void create(final User user) {
		save(user);
	}

	public User getById(final long id) {
		return storage.get(id);
	}

	public List<User> search(final UserQuery userQuery) {
		if (userQuery == null)
			throw new IllegalArgumentException("argument user is null");
		if (!userQuery.isFilter())
			return new ArrayList<User>(storage.values());

		final List<User> filteredByIds = filterByIds(userQuery);
		return filterByName(userQuery, filteredByIds);
	}

	public List<User> getAll() {
		return new ArrayList<User>(storage.values());
	}

	public void save(User user) {
		if (user == null)
			throw new IllegalArgumentException("argument user is null");
		if (user.getName() == null || user.getName().isEmpty())
			throw new IllegalArgumentException("argument user.name is empty");

		if (user.getId() <= 0)
			user.setId(idGenerator.incrementAndGet());

		storage.put(user.getId(), user);
	}

	public void delete(User user) {
		if (user == null)
			throw new IllegalArgumentException("argument user is null");

		delete(user.getId());
	}

	public void delete(long id) {

		// some custom delete logic
		deleteUsersLogo();

		storage.remove(id);
	}

	// private methods

	private List<User> filterByIds(final UserQuery userQuery) {
		if (userQuery.getIdsToFilter().isEmpty())
			return new ArrayList<User>(storage.values());

		final List<User> result = new LinkedList<User>();
		for (Map.Entry<Long, User> entry : storage.entrySet()) {
			if (!userQuery.getIdsToFilter().contains(entry.getKey()))
				continue;

			result.add(entry.getValue());
		}
		return result;
	}

	private List<User> filterByName(final UserQuery userQuery, final List<User> filtered) {
		if (userQuery.getNameQuery() == null || userQuery.getNameQuery().isEmpty())
			return filtered;

		final List<User> result = new LinkedList<User>();
		for (final User user : filtered) {
			if (!userQuery.getNameQuery().equals(user.getName()))
				continue;

			result.add(user);
		}
		return result;
	}

	private void deleteUsersLogo() {
		System.out.println("Logo deleted");
	}
}
