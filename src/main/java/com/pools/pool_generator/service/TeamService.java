package com.pools.pool_generator.service;

import com.pools.pool_generator.domain.entities.Team;
import com.pools.pool_generator.service.base.BaseService;
import com.pools.pool_generator.service.interfaces.ITeamService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public class TeamService extends BaseService<Team, UUID> implements ITeamService {

    protected TeamService(JpaRepository<Team, UUID> repository) {
        super(repository);
    }
}
