package com.vivaladev.restApi_for_mongo.controllers;

import com.vivaladev.restApi_for_mongo.entity.MongoEntity;
import com.vivaladev.restApi_for_mongo.repository.TestEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/mongotest")
public class MongoController {

    @Autowired
    private TestEntityRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<MongoEntity> getAll(){
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public MongoEntity getById(@PathVariable("id") String id){
        return repository.findBy_id(id);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public MongoEntity createEntity(@Valid @RequestBody MongoEntity entity){
        repository.save(entity);
        return entity;
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.PUT)
    public MongoEntity editEntityById(@Valid @RequestBody MongoEntity entity, @PathVariable String id){
        entity.set_id(id);
        repository.save(entity);
        return entity;
    }

    @RequestMapping(value = "/remove/{id}", method = RequestMethod.DELETE)
    public void removeEntity(@PathVariable String id){
        repository.delete(repository.findBy_id(id));
    }
}
