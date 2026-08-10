package com.cursospring.minitwitter.models.post;

import com.cursospring.minitwitter.models.like.Like;
import com.cursospring.minitwitter.models.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "posts")
@Data
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @JsonIgnore
    private User user;

    @Column(name = "conteudo", nullable = false, length = 500)
    private String conteudo;
    @Column(name = "data_criacao", nullable = false, insertable = false, updatable = false)
    private Instant dataCriacao;
    @OneToMany
    @JsonIgnore
    private List<Like> likes;
}