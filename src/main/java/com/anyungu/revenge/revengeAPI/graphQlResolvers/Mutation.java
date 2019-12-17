package com.anyungu.revenge.revengeAPI.graphQlResolvers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anyungu.revenge.revengeAPI.models.Anger;
import com.anyungu.revenge.revengeAPI.models.Angry;
import com.anyungu.revenge.revengeAPI.models.User;
import com.anyungu.revenge.revengeAPI.repositories.AngerRepository;
import com.anyungu.revenge.revengeAPI.repositories.AngryRepository;
import com.anyungu.revenge.revengeAPI.repositories.UserRepository;
import com.anyungu.revenge.revengeAPI.services.UserService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import graphql.GraphQLException;

@Component
public class Mutation implements GraphQLMutationResolver {

	@Autowired
	private AngerRepository angerRepository;

	@Autowired
	private UserService userService;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private AngryRepository angryRepository;

	@Autowired
	private Query query;

	public Anger createAnger(String definer, String cause, String description) {

		Anger anger = new Anger();
		anger.setCause(cause);
		anger.setDefiner(definer);
		anger.setDescription(description);

		return angerRepository.save(anger);

	}

	public User createUser(String email, String name, String password, Integer yoB) throws GraphQLException {

		return userService.createUser(email, name, password, yoB);

	}

	public Angry createAngry(String causeId, String cause, String me, String provoker, Integer level) {

		Angry angry = new Angry();
		angry.setCause(cause);
		angry.setCauseId(causeId);
		angry.setCleared(false);
		angry.setForgiven(false);
		angry.setLevel(level);
		angry.setMe(me);
		angry.setProvoker(provoker);

		return angryRepository.save(angry);

	}

	public void deleteOneUser(String email) {

		List<User> findOneUser = query.findOneUser(email);

		userRepository.deleteAll(findOneUser);

	}
}
