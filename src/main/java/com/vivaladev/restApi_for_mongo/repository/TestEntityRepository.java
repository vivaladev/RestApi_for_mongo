package com.vivaladev.restApi_for_mongo.repository;

import com.vivaladev.restApi_for_mongo.entity.MongoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface TestEntityRepository extends MongoRepository<MongoEntity, String> {

    MongoEntity findByName(String name);

    MongoEntity findBy_id(String id);
}
