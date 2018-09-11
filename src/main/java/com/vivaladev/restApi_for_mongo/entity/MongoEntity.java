package com.vivaladev.restApi_for_mongo.entity;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

@Data
@EntityScan
public class MongoEntity {

    @Id
    private String _id;

    private String name;

    private String description;

    public MongoEntity(String name, String description){
        this.name = name;
        this.description = description;
    }

    public MongoEntity() {}

    @Override
    public String toString(){
        return String.format(
                "MongoEntity: %s, %s",
                name, description
        );
    }
}
