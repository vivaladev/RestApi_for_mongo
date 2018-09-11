package com.vivaladev.restApi_for_mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories({"com.vivaladev.restApi_for_mongo.repository"})
public class RestApiForMongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApiForMongoApplication.class, args);
    }
}
