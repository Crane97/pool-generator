package com.pools.pool_generator.domain.entities;

import com.pools.pool_generator.domain.Timestamps;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;
import java.util.UUID;

@Data
@Entity
public class Team extends Timestamps {
    @Id
    @GeneratedValue
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private UUID id;

    @NotNull
    private String name;

    private List<String> players;

    @ManyToOne
    @JoinColumn(name = "pool_id")
    private Pool pool;
}
