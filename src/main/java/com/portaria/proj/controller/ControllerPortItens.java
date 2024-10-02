package com.portaria.proj.controller;

import com.portaria.proj.entity.EntityPortItens;
import com.portaria.proj.repository.RepositoryPortItens;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/itens")
public class ControllerPortItens {

    @Autowired
    private RepositoryPortItens repositoryPortItens;

    @PostMapping(value = "/")
    public ResponseEntity<EntityPortItens> cadastrar (@RequestBody EntityPortItens entityPortItens){
        EntityPortItens itens = repositoryPortItens.save(entityPortItens);
        return new ResponseEntity<EntityPortItens>(itens, HttpStatus.OK);
    }
    @PutMapping(value = "/")
  public ResponseEntity<EntityPortItens> atualizar (@RequestBody EntityPortItens entityPortItens) {
      EntityPortItens itens = repositoryPortItens.save(entityPortItens);
      return new ResponseEntity<EntityPortItens>(itens, HttpStatus.OK);
  }

}
