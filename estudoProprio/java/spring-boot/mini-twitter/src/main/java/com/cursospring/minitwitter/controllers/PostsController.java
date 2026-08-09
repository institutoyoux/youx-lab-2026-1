package com.cursospring.minitwitter.controllers;

import com.cursospring.minitwitter.models.post.Post;
import com.cursospring.minitwitter.models.post.PostMapper;
import com.cursospring.minitwitter.models.post.dto.PostCreateDto;
import com.cursospring.minitwitter.models.post.dto.PostResponseDto;
import com.cursospring.minitwitter.models.user.UserMapper;
import com.cursospring.minitwitter.services.PostService;
import com.cursospring.minitwitter.services.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
@CrossOrigin
public class PostsController {
    private final PostService postService;
    private final PostMapper postMapper;
    private final UserService userService;
    private final UserMapper userMapper;

    @PostMapping("/new")
    public ResponseEntity newPost(@RequestBody @Valid PostCreateDto post, Authentication authentication) {
        String username = authentication.getName();
        var postEntity = postMapper.toEntity(post, userService.buscarPorUsername(username));
        postEntity.setUser(userService.buscarPorUsername(username));
        postService.salvar(postEntity);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/all")
    public ResponseEntity<Page<PostResponseDto>> getAllPosts(@PageableDefault(size = 10, sort = "dataCriacao", direction = Sort.Direction.DESC) Pageable pageable) {
        var posts = postService.todosPosts(pageable);
        var postsMap = posts.map(post -> new PostResponseDto(post.getId(), post.getDataCriacao(), post.getConteudo(), userMapper.toUserResponseDto(post.getUser())));
        return ResponseEntity.ok(postsMap);
    }
}
