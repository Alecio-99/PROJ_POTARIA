package com.portaria.proj.controller;

import com.portaria.proj.entity.EntityMoradores;
import com.portaria.proj.repository.RepositoryMoradores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/moradores")
public class ControllerMoradores {

    @Autowired
    private RepositoryMoradores  repositoryMoradores;

    @PostMapping(value = "/")
    public ResponseEntity<EntityMoradores> moradores (@RequestBody EntityMoradores entityMoradores){
        EntityMoradores apto = repositoryMoradores.save(entityMoradores);
        return new ResponseEntity<EntityMoradores>(apto, HttpStatus.OK);
    }
    @PutMapping(value = "/")
    public ResponseEntity<EntityMoradores> atualizar (@RequestBody  EntityMoradores entityMoradores){
        EntityMoradores apto = repositoryMoradores.save(entityMoradores);
        return new ResponseEntity<EntityMoradores>(apto, HttpStatus.OK);
    }

    @GetMapping(value = "/buscaApto")
    public ResponseEntity<List<EntityMoradores>> getPorApto (@RequestParam (name = "apto" ) String apto){
        List<EntityMoradores> lista = repositoryMoradores.getPorApto(apto);
        return new ResponseEntity<List<EntityMoradores>>(lista, HttpStatus.OK);
    }

    @GetMapping(value = "/buscaNome")
    public  ResponseEntity<List<EntityMoradores>> getPorNome (@RequestParam (name = "nome") String nome){
        List<EntityMoradores> lista = repositoryMoradores.getPorNome(nome);
        return new ResponseEntity<List<EntityMoradores>>(lista, HttpStatus.OK);

    }
}
