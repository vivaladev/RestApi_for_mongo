package com.vivaladev.restApi_for_mongo.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class DefaultEntity {

    @Getter
    @Setter
    private String helloWorld;

    public DefaultEntity() {
        this.helloWorld = "Hello Springframework";
    }
}
