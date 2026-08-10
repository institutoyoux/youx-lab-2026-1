package com.cursospring.minitwitter.services;

import com.cursospring.minitwitter.models.like.Like;
import com.cursospring.minitwitter.models.post.Post;
import com.cursospring.minitwitter.models.user.User;
import com.cursospring.minitwitter.repositories.LikeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class LikeService {

    private final PostService postService;
    private final UserService userService;
    private final LikeRepository repository;

    public void like(Like like) {
        postService.addLike(like);
        userService.addLike(like);
        repository.save(like);
    }
    public void dislike(Like like) {
        postService.removeLike(like);
        userService.removeLike(like);
        repository.delete(like);
    }
    public Optional<Like> buscarPorUserEPost(User user, Post post) {
        return repository.findByPostIdAndUserId(post.getId(), user.getId());
    }

    public Boolean verLikedPorIds(UUID postId, UUID userId) {
        return repository.findByPostIdAndUserId(postId, userId).isPresent();
    }
}
