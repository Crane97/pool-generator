package com.pools.pool_generator.domain.entities;

import com.pools.pool_generator.domain.Timestamps;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@Data
public class Users extends Timestamps {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private UUID id;

    @NotNull
    private String name;

    @NotNull
    private String surname;

    @Column(unique = true)
    private String username;

    @Email
    @NotNull
    @Column(unique = true)
    private String email;

    @NotNull
    private String password;

}
