package com.pools.pool_generator.service.base;

import java.util.List;
import java.util.Optional;

public interface IBaseService<T, ID> {
    List<T> findAll();
    Optional<T> findById(ID id);
    T save(T entity);
    void deleteById(ID id);
}
