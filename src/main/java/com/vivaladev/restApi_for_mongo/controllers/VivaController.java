package com.vivaladev.restApi_for_mongo.controllers;

import com.vivaladev.restApi_for_mongo.entity.DefaultEntity;
import com.vivaladev.restApi_for_mongo.services.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/viva/1")
public class VivaController {

    private RestService restService;

    @Autowired
    public VivaController(RestService restService) {
        this.restService = restService;
    }

    @GetMapping(value = "/get/defaultentity")
    public DefaultEntity getDefaultEntity() {
        return restService.getDefaultEntity();
    }
}
