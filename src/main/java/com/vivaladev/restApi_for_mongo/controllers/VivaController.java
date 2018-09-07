package com.vivaladev.restApi_for_mongo.controllers;

import com.vivaladev.restApi_for_mongo.entity.DefaultGetEntity;
import com.vivaladev.restApi_for_mongo.entity.DefaultPostEntity;
import com.vivaladev.restApi_for_mongo.services.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/viva/1")
public class VivaController {

    private RestService restService;

    @Autowired
    public VivaController(RestService restService) {
        this.restService = restService;
    }

    @GetMapping(value = "/get/defaultentity")
    public DefaultGetEntity getGetDefaultEntity() {
        return restService.getGetDefaultEntity();
    }

    @PostMapping(value = "/get/post/get/postentity")
    public DefaultPostEntity getPostDefaultEntity(@RequestBody DefaultPostEntity postEntity){
        return restService.getPostDefaultEntity(postEntity);
    }
}
