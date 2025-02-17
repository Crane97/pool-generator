package com.pools.pool_generator.service;

import com.pools.pool_generator.domain.entities.PoolParticipant;
import com.pools.pool_generator.service.base.BaseService;
import com.pools.pool_generator.service.interfaces.IPoolParticipantService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public class PoolParticipantService extends BaseService<PoolParticipant, UUID> implements IPoolParticipantService  {
    protected PoolParticipantService(JpaRepository<PoolParticipant, UUID> repository) {
        super(repository);
    }
}
