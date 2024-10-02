package com.portaria.proj.repository;

import com.portaria.proj.entity.EntityEntregue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEntregue extends JpaRepository<EntityEntregue, Long> {
}
