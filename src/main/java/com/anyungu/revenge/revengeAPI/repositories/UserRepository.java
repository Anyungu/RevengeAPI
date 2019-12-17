package com.anyungu.revenge.revengeAPI.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.anyungu.revenge.revengeAPI.models.User;

public interface UserRepository extends MongoRepository<User, String> {

	List<User> findByEmail(String email);

}
