package com.cursospring.minitwitter.services;

import com.cursospring.minitwitter.models.post.Post;
import com.cursospring.minitwitter.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

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
}
