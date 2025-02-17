package com.pools.pool_generator.service;

import com.pools.pool_generator.domain.entities.Match;
import com.pools.pool_generator.service.base.BaseService;
import com.pools.pool_generator.service.interfaces.IMatchService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public class MatchService extends BaseService<Match, UUID> implements IMatchService {
    protected MatchService(JpaRepository repository) {
        super(repository);
    }
}
