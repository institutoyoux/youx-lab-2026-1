package com.projetos.backend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String username;
    private String nome;
    @Column(name = "url_foto")
    private String fotoUrl;
    @Column(name = "url_doc")
    private String DocUrl;
}
