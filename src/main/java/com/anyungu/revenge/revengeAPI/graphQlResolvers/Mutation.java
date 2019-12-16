package com.anyungu.revenge.revengeAPI.graphQlResolvers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.anyungu.revenge.revengeAPI.models.Anger;
import com.anyungu.revenge.revengeAPI.models.Angry;
import com.anyungu.revenge.revengeAPI.models.User;
import com.anyungu.revenge.revengeAPI.repositories.AngerRepository;
import com.anyungu.revenge.revengeAPI.repositories.AngryRepository;
import com.anyungu.revenge.revengeAPI.repositories.UserRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class Mutation implements GraphQLMutationResolver {

	@Autowired
	private AngerRepository angerRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private AngryRepository angryRepository;

	public Anger createAnger(String definer, String cause, String description) {

		Anger anger = new Anger();
		anger.setCause(cause);
		anger.setDefiner(definer);
		anger.setDescription(description);

		return angerRepository.save(anger);

	}

	public User createUser(String email, String name, String password, Integer yoB) {

		User user = new User();
		user.setEmail(email);
		user.setName(name);
		user.setPassword(password);
		user.setYoB(yoB);

		return userRepository.save(user);

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
}
