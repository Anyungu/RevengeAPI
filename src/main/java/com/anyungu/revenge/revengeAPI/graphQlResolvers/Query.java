package com.anyungu.revenge.revengeAPI.graphQlResolvers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anyungu.revenge.revengeAPI.models.Anger;
import com.anyungu.revenge.revengeAPI.models.Angry;
import com.anyungu.revenge.revengeAPI.models.User;
import com.anyungu.revenge.revengeAPI.repositories.AngerRepository;
import com.anyungu.revenge.revengeAPI.repositories.AngryRepository;
import com.anyungu.revenge.revengeAPI.repositories.UserRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Service
public class Query implements GraphQLQueryResolver {

	@Autowired
	private AngerRepository angerRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private AngryRepository angryRepository;

	public List<Anger> findAllAngers() {
		return angerRepository.findAll();
	}

	public List<Angry> findAllAngry() {
		return angryRepository.findAll();
	}

	public List<User> findAllUsers() {
		return userRepository.findAll();
	}

	public Optional<User> findOneUser(String email) {
		return userRepository.findByEmail(email);
	}

}
