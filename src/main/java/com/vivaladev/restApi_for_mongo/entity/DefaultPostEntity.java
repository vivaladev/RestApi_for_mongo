package com.vivaladev.restApi_for_mongo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DefaultPostEntity{

    private String name;
    private String id;
    private String type;
    private String defaultField;
}
