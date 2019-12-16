package com.anyungu.revenge.revengeAPI.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.anyungu.revenge.revengeAPI.models.Anger;

public interface AngerRepository extends MongoRepository<Anger, String> {

}
