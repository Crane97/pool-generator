package com.pools.pool_generator.domain.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
public class PoolResult {

    @Id
    @GeneratedValue
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "pool_id")
    private Pool pool;

    @ManyToOne
    @JoinColumn(name = "winner_id")
    private Users winner;

    @Column(name = "completion_date")
    private LocalDateTime completionDate;

    @Column(name = "total_prize")
    private Double totalPrize;
}