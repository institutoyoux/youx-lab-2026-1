package com.cursospring.minitwitter.models.post;

import com.cursospring.minitwitter.models.post.dto.PostCreateDto;
import com.cursospring.minitwitter.models.user.User;
import org.springframework.stereotype.Component;

@Component
public class PostMapper {
    public Post toEntity(PostCreateDto postDto, User user) {
        var post = new Post();
        post.setConteudo(postDto.conteudo());
        post.setUser(user);
        return post;
    }
}
