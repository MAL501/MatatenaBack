package com.matatena.matatenaback.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity

@Table(name = "game")

public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "host_id", nullable = false) // Define la FK para el host
    private UserEntity host;
    @ManyToOne
    @JoinColumn(name = "guest_id", nullable = false) // Define la FK para el guest
    private UserEntity guest;
    private LocalDateTime started_at = LocalDateTime.now();
    private LocalDateTime ended_at;
}
