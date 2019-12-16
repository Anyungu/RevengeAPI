package com.anyungu.revenge.revengeAPI.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.anyungu.revenge.revengeAPI.models.User;

public interface UserRepository extends MongoRepository<User, String> {

//	Optional<User> findByEmail(String email);

}
