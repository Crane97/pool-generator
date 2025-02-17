package com.pools.pool_generator.service;

import com.pools.pool_generator.domain.entities.Users;
import com.pools.pool_generator.service.base.BaseService;
import com.pools.pool_generator.service.interfaces.IUsersService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public class UsersService extends BaseService<Users, UUID> implements IUsersService {
    protected UsersService(JpaRepository<Users, UUID> repository) {
        super(repository);
    }
}
