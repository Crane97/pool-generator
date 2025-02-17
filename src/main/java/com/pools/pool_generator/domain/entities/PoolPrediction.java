package com.pools.pool_generator.domain.entities;

import com.pools.pool_generator.domain.Timestamps;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Data
@Entity
public class PoolPrediction extends Timestamps {
    @Id
    @GeneratedValue
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "pool_participant_id", nullable = false)
    private PoolParticipant poolParticipant;

    @Column(name = "round_number", nullable = false)
    private int roundNumber;

    @ManyToOne
    @JoinColumn(name = "predicted_team_id", nullable = false)
    private Team predictedTeam;

    @Column(name = "actual_result")
    private String actualResult;

    @Column(name = "points_earned")
    private Long pointsEarned;
}
