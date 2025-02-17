package com.pools.pool_generator.domain.entities;

import com.pools.pool_generator.domain.Timestamps;
import com.pools.pool_generator.domain.enums.EnumPoolFormat;
import com.pools.pool_generator.domain.enums.EnumPoolState;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;
import java.util.UUID;

@Data
@Entity
public class Pool extends Timestamps {
    @Id
    @GeneratedValue
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private UUID id;

    @NotNull
    private String name;

    @NotNull
    private Double entryPrice;

    @Enumerated(EnumType.STRING)
    private EnumPoolFormat format;

    @Enumerated(EnumType.STRING)
    private EnumPoolState state;

    @ManyToOne
    @JoinColumn(name = "creator_id")
    private Users creator;

    @OneToMany
    private List<Team> Teams;
}
