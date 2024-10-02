package com.portaria.proj.controller;

import com.portaria.proj.entity.EntityStatus;
import com.portaria.proj.repository.RepositoryStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/status")
public class ControllerStatus {

    @Autowired
    private RepositoryStatus repositoryStatus;

    @PostMapping(value = "/")
    public ResponseEntity<EntityStatus> status (@RequestBody EntityStatus entityStatus){
        EntityStatus status = repositoryStatus.save(entityStatus);
        return new ResponseEntity<EntityStatus>(status, HttpStatus.OK);
    }
}
