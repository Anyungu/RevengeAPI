package com.anyungu.revenge.revengeAPI.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anyungu.revenge.revengeAPI.exceptions.CustomException;
import com.anyungu.revenge.revengeAPI.graphQlResolvers.Query;
import com.anyungu.revenge.revengeAPI.models.User;
import com.anyungu.revenge.revengeAPI.repositories.UserRepository;

import graphql.GraphQLException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private Query query;

	public User createUser(String email, String name, String password, Integer yoB) throws CustomException {

		List<User> findOneUser = query.findOneUser(email);
		
		System.out.println(findOneUser);

		if (!findOneUser.isEmpty()) {
			throw new CustomException(404, "User Already Exists");
		}

		User user = new User();
		user.setEmail(email);
		user.setName(name);
		user.setPassword(password);
		user.setYoB(yoB);

		return userRepository.save(user);

	}

}
