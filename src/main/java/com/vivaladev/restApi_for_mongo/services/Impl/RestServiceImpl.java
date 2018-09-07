package com.vivaladev.restApi_for_mongo.services.Impl;

import com.vivaladev.restApi_for_mongo.entity.DefaultGetEntity;
import com.vivaladev.restApi_for_mongo.entity.DefaultPostEntity;
import com.vivaladev.restApi_for_mongo.services.RestService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class RestServiceImpl implements RestService {

    @Override
    public DefaultGetEntity getGetDefaultEntity() {
        return new DefaultGetEntity();
    }

    @Override
    public DefaultPostEntity getPostDefaultEntity(DefaultPostEntity postEntity) {
        return new DefaultPostEntity(postEntity.getName()+"done", postEntity.getId()+"done",
                postEntity.getType()+"done", postEntity.getDefaultField()+"done");
    }
}
