package com.scm.services;

import java.util.List;
import java.util.Optional;

import com.scm.entities.User;

public interface UserService {

	List<User> getAllUsers();

	User saveUser(User user);

	Optional<User> getUserById(String id);

	Optional<User> UpdateUser(User user);

	boolean deleteUser(String id);

	boolean isUserExist(String userId);

	boolean isUserExistByEmail(String email);
	
	User getUserByEmail(String email);

}
