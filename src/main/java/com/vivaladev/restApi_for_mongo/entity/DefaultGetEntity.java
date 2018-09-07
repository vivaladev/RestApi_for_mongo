package com.vivaladev.restApi_for_mongo.entity;

import lombok.Data;

@Data
public class DefaultGetEntity {

    private String helloWorld;

    public DefaultGetEntity() {
        this.helloWorld = "Hello Springframework";
    }
}
