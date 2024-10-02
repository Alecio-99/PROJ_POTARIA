package com.portaria.proj.repository;

import com.portaria.proj.entity.EntityMoradores;
import com.portaria.proj.entity.EntityPortItens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface RepositoryPortItens extends JpaRepository<EntityPortItens, Long> {

    @Query(value = " select c from EntityPortItens c where c.name_produto like %?1% ")
    ArrayList<EntityMoradores> getPorProduto(String name_produto);

}
