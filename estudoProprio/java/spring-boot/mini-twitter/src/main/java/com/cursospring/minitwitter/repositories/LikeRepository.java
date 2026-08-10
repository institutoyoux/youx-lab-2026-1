package com.cursospring.minitwitter.repositories;

import com.cursospring.minitwitter.models.like.Like;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface LikeRepository extends JpaRepository<Like, UUID> {
    Optional<Like> findByPostIdAndUserId(UUID postId, UUID userId);
}
