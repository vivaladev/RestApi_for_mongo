package com.vivaladev.restApi_for_mongo.services.Impl;

import com.vivaladev.restApi_for_mongo.entity.DefaultEntity;
import com.vivaladev.restApi_for_mongo.services.RestService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class RestServiceImpl implements RestService {

    @Override
    public DefaultEntity getDefaultEntity() {
        return new DefaultEntity();
    }

}
