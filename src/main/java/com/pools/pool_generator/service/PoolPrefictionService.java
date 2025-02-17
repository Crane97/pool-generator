package com.pools.pool_generator.service;

import com.pools.pool_generator.domain.entities.PoolPrediction;
import com.pools.pool_generator.service.base.BaseService;
import com.pools.pool_generator.service.interfaces.IPoolPredictionService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public class PoolPrefictionService extends BaseService<PoolPrediction, UUID> implements IPoolPredictionService {
    protected PoolPrefictionService(JpaRepository<PoolPrediction, UUID> repository) {
        super(repository);
    }
}
