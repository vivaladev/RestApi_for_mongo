package com.vivaladev.restApi_for_mongo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontendController {

    @RequestMapping("index")
    public String index(){
        return "index";
    }
}
