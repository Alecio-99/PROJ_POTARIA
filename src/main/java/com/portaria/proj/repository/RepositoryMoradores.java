package com.portaria.proj.repository;

import com.portaria.proj.entity.EntityMoradores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface RepositoryMoradores extends JpaRepository<EntityMoradores, Long> {
    @Query(value = " select c from EntityMoradores c where c.apto_morador like %?1% ")
    ArrayList<EntityMoradores> getPorApto(String apto_morador);

    @Query(value = " select c from EntityMoradores c where c.name_morador like %?1% ")
    ArrayList<EntityMoradores> getPorNome(String name_morador);
}
