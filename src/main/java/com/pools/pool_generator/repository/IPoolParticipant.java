package com.pools.pool_generator.repository;

import com.pools.pool_generator.domain.entities.PoolParticipant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IPoolParticipant extends JpaRepository<PoolParticipant, UUID> {
}
