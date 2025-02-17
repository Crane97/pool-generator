package com.pools.pool_generator.repository;

import com.pools.pool_generator.domain.entities.PoolResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IPoolResult extends JpaRepository<PoolResult, UUID> {
}
