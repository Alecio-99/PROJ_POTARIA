package com.portaria.proj.controller;

import com.portaria.proj.DAO.PedidosEntegueDTO;
import com.portaria.proj.entity.EntityEntregue;
import com.portaria.proj.service.ServiceCondominio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/entregue")
public class ControllerEntregue {

    @Autowired
    private ServiceCondominio service;

    public ResponseEntity<EntityEntregue> entreguePedido (@RequestBody PedidosEntegueDTO pedidosEntegueDTO){
        EntityEntregue entregue = service.entreguePedido(pedidosEntegueDTO);
        return new ResponseEntity<>(entregue, HttpStatus.OK);
    }


}
