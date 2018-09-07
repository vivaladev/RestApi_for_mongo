package com.vivaladev.restApi_for_mongo.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.jackson2.SecurityJackson2Modules;
import org.springframework.stereotype.Service;

@Service
public class JsonParserUtils {

    private ObjectMapper mapper;
    private ClassLoader loader;

    @Autowired
    public JsonParserUtils(ObjectMapper mapper) {
        mapper.registerModule(new JavaTimeModule());
        mapper.registerModules(SecurityJackson2Modules.getModules(this.loader));
        this.mapper = mapper;
    }
}
