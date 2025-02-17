package com.pools.pool_generator.domain.entities;

import com.pools.pool_generator.domain.Timestamps;
import com.pools.pool_generator.domain.enums.EnumPaymentDetails;
import com.pools.pool_generator.domain.enums.EnumPoolState;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
public class PoolParticipant extends Timestamps {

    @Id
    @GeneratedValue
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "pool_id")
    private Pool pool;

    @Column(name = "join_date")
    private LocalDateTime joinDate;

    @Enumerated(EnumType.STRING)
    private EnumPaymentDetails paymentDetails;

    @Column(name = "paid")
    private boolean paid;

    @Column(name = "totalPoints")
    private Long totalPoints;
}
