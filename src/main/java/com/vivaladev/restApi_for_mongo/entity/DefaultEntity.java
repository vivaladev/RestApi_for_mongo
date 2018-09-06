package com.vivaladev.restApi_for_mongo.entity;

import lombok.Data;

@Data
public class DefaultEntity {

    private String helloWorld;

    public DefaultEntity(){
        this.helloWorld = "Default entity.";
    }

    public DefaultEntity(String param) {
        this.helloWorld = param;
    }
}
