package com.portaria.proj.repository;

import com.portaria.proj.entity.EntityStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryStatus extends JpaRepository<EntityStatus, Long> {
}
