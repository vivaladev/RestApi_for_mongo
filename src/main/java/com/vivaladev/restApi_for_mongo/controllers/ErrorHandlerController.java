package com.vivaladev.restApi_for_mongo.controllers;

import com.vivaladev.restApi_for_mongo.entity.ErrorResponse;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorHandlerController implements ErrorController {

    private static final String ERROR_PATH = "/error";

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }

    @RequestMapping(value = ERROR_PATH)
    public ErrorResponse processingErrorRequest() {
        return null;
    }
}
