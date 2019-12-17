package com.anyungu.revenge.revengeAPI.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anyungu.revenge.revengeAPI.graphQlResolvers.Query;
import com.anyungu.revenge.revengeAPI.models.User;
import com.anyungu.revenge.revengeAPI.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private Query query;

	public User createUser(String email, String name, String password, Integer yoB) throws Exception {

		List<User> findOneUser = query.findOneUser(email);

		if (!findOneUser.isEmpty()) {
			throw new Exception("User Already Exists");
		}

		User user = new User();
		user.setEmail(email);
		user.setName(name);
		user.setPassword(password);
		user.setYoB(yoB);

		return userRepository.save(user);

	}

}
