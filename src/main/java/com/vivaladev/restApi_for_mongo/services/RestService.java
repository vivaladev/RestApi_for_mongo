package com.vivaladev.restApi_for_mongo.services;

import com.vivaladev.restApi_for_mongo.entity.DefaultGetEntity;
import com.vivaladev.restApi_for_mongo.entity.DefaultPostEntity;

public interface RestService {

    DefaultGetEntity getGetDefaultEntity();

    DefaultPostEntity getPostDefaultEntity(DefaultPostEntity postEntity);
}
