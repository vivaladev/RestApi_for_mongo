package com.vivaladev.restApi_for_mongo.services;

import com.vivaladev.restApi_for_mongo.entity.DefaultEntity;

public interface RestService {

    DefaultEntity getDefaultEntity();

    DefaultEntity getDefaultEntityWithParam(String param);
}
