package com.anyungu.revenge.revengeAPI.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.anyungu.revenge.revengeAPI.models.Angry;

public interface AngryRepository extends MongoRepository<Angry, String> {

}
