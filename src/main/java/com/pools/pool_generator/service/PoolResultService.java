package com.pools.pool_generator.service;

import com.pools.pool_generator.domain.entities.PoolResult;
import com.pools.pool_generator.service.base.BaseService;
import com.pools.pool_generator.service.interfaces.IPoolResultService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public class PoolResultService extends BaseService<PoolResult, UUID> implements IPoolResultService {
    protected PoolResultService(JpaRepository<PoolResult, UUID> repository) {
        super(repository);
    }
}
