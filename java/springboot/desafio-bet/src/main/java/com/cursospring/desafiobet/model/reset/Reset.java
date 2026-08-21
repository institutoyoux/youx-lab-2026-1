package com.cursospring.desafiobet.model.reset;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.Instant;

@Entity
@Table(name = "reset_codes")
@Data
@RequiredArgsConstructor
public class Reset {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @JoinColumn(name = "user_id")
    private Long userId;
    private Integer code;
    private Instant expireDate;
}
