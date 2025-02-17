package com.pools.pool_generator.domain.entities;

import com.pools.pool_generator.domain.Timestamps;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "match")
@Data
public class Match extends Timestamps {

    @Id
    @GeneratedValue
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private UUID id;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(nullable = false)
    private LocalDateTime modifiedAt = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "pool_id", nullable = false)
    private Pool pool;

    @ManyToOne
    @JoinColumn(name = "team1_id", nullable = false)
    private Team team1;

    @ManyToOne
    @JoinColumn(name = "team2_id", nullable = false)
    private Team team2;

    private Integer scoreTeam1;
    private Integer scoreTeam2;

    @Column(nullable = false)
    private LocalDateTime matchDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private MatchStatus status = MatchStatus.PENDING;

    public enum MatchStatus {
        PENDING, IN_PROGRESS, FINISHED
    }
}
