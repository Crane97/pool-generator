package com.pools.pool_generator.service;

import com.pools.pool_generator.domain.entities.Pool;
import com.pools.pool_generator.service.base.BaseService;
import com.pools.pool_generator.service.interfaces.IPoolService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public class PoolService extends BaseService<Pool, UUID> implements IPoolService {
    protected PoolService(JpaRepository<Pool, UUID> repository) {
        super(repository);
    }
}
