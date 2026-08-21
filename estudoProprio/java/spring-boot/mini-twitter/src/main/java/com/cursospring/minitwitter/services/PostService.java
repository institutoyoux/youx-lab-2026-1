package com.cursospring.minitwitter.services;

import com.cursospring.minitwitter.models.like.Like;
import com.cursospring.minitwitter.models.post.Post;
import com.cursospring.minitwitter.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository repository;
    public void salvar(Post post) {
        repository.save(post);
    }

    public Page<Post> todosPosts(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Optional<Post> buscarporId(UUID id) {
        return repository.findById(id);
    }

    public void addLike(Like like) {
        Optional<Post> postOptional = buscarporId(like.getPost().getId());
        if (postOptional.isEmpty()) {
            throw new IllegalArgumentException("Post não encontrado");
        }
        postOptional.get().getLikes().add(like);
    }

    public void removeLike(Like like) {
        Optional<Post> postOptional = buscarporId(like.getPost().getId());
        if (postOptional.isEmpty()) {
            throw new IllegalArgumentException("Post não encontrado");
        }
        postOptional.get().getLikes().remove(like);
    }

    public void deletar(Post post) {
        repository.delete(post);
    }
}
