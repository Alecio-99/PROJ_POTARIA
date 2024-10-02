package com.portaria.proj.service;


import com.portaria.proj.DAO.PedidosEntegueDTO;
import com.portaria.proj.entity.EntityEntregue;
import com.portaria.proj.entity.EntityMoradores;
import com.portaria.proj.entity.EntityPortItens;
import com.portaria.proj.entity.EntityStatus;
import com.portaria.proj.repository.RepositoryEntregue;
import com.portaria.proj.repository.RepositoryMoradores;
import com.portaria.proj.repository.RepositoryPortItens;
import com.portaria.proj.repository.RepositoryStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceCondominio {

    @Autowired
    private RepositoryEntregue repositoryEntregue;
    @Autowired
    private RepositoryMoradores repositoryMoradores;
    @Autowired
    private RepositoryPortItens repositoryPortItens;
    @Autowired
    private RepositoryStatus repositoryStatus;

     public EntityEntregue entreguePedido (PedidosEntegueDTO pedidosEntegueDTO){
         Optional<EntityMoradores> moradores = repositoryMoradores.findById(pedidosEntegueDTO.getModadorId());
         Optional<EntityPortItens> itens = repositoryPortItens.findById(pedidosEntegueDTO.getItensId());
         Optional<EntityStatus> status = repositoryStatus.findById(pedidosEntegueDTO.getStatusId());

         if (moradores.isPresent() && itens.isPresent() && status.isPresent()){
             EntityMoradores moradores1 =  moradores.get();
             EntityPortItens itens1 = itens.get();
             EntityStatus status1 = status.get();

             EntityEntregue entregue = new EntityEntregue();
             entregue.setApto_morador(String.valueOf(moradores1));
             entregue.setItens(itens1);
             entregue.setStatus(status1);

             return repositoryEntregue.save(entregue);
         }else {
             throw new RuntimeException("Morador não encontrado");
         }

     }

}
