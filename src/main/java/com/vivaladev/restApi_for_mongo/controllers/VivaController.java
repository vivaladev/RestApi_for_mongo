package com.vivaladev.restApi_for_mongo.controllers;

import com.vivaladev.restApi_for_mongo.entity.DefaultEntity;
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
    public DefaultEntity getDefaultEntity() {
        return restService.getDefaultEntity();
    }

    @GetMapping(value = "/get")
    public DefaultEntity getDefaultEntityWithParam(@RequestParam(value="str",
            defaultValue = "Babushkin") String paramStr){
        return restService.getDefaultEntityWithParam(paramStr);
    }
}
