package com.epom.services;

import java.util.List;

/**
 * @author Vasyl Zarva.
 */
public interface UserService {

	// CREATE

	/**
	 * Create user.
	 *
	 * @param user
	 * 		{@link User}, can't be {@code null}
	 */
	void create(User user);

	// FIND

	/**
	 * Find user by given id.
	 *
	 * @param id
	 * 		user identifier
	 * @return {@link User} or {@code null} if not found
	 */
	User getById(long id);

	List<User> search(UserQuery userQuery);

	List<User> getAll();

	// UPDATE

	void save(User user);

	// DELETE

	void delete(User user);

	void delete(long id);
}
