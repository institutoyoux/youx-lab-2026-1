package com.cursospring.minitwitter.controllers;

import com.cursospring.minitwitter.models.like.Like;
import com.cursospring.minitwitter.models.post.Post;
import com.cursospring.minitwitter.models.post.PostMapper;
import com.cursospring.minitwitter.models.post.dto.PostCreateDto;
import com.cursospring.minitwitter.models.post.dto.PostResponseDto;
import com.cursospring.minitwitter.models.user.User;
import com.cursospring.minitwitter.models.user.UserMapper;
import com.cursospring.minitwitter.services.LikeService;
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

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
@CrossOrigin
public class PostsController {
    private final PostService postService;
    private final PostMapper postMapper;
    private final UserService userService;
    private final UserMapper userMapper;
    private final LikeService likeService;

    @PostMapping("/new")
    public ResponseEntity<Void> newPost(@RequestBody @Valid PostCreateDto post, Authentication authentication) {
        String username = authentication.getName();
        User user = userService.buscarPorUsername(username).orElseThrow(() -> new IllegalArgumentException("Usuario não encontrado"));
        Post postEntity = postMapper.toEntity(post, user);
        postService.salvar(postEntity);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/all")
    public ResponseEntity<Page<PostResponseDto>> getAllPosts(
            @PageableDefault(size = 10, sort = "dataCriacao", direction = Sort.Direction.DESC) Pageable pageable,
            Authentication authentication
    ) {
        Page<Post> posts = postService.todosPosts(pageable);

        User user = userService.buscarPorUsername(authentication.getName()).orElseThrow(() -> new IllegalArgumentException("Usuario não encontrado"));
        Page<PostResponseDto> postsMap = posts.map(post -> new PostResponseDto(post.getId(), post.getDataCriacao(), post.getConteudo(), post.getLikes().size(), likeService.verLikedPorIds(post.getId(), user.getId()), userMapper.toUserResponseDto(post.getUser()), user.getId() == post.getUser().getId()));
        return ResponseEntity.ok(postsMap);
    }
    @PostMapping("/{id}/like")
    public ResponseEntity<Object> likePost(@PathVariable("id") UUID id, Authentication authentication) {
        if (id == null) {
            return ResponseEntity.badRequest().build();
        }
        Optional<Post> postOptional = postService.buscarporId(id);
        if (postOptional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        User user = userService.buscarPorUsername(authentication.getName()).orElseThrow(() -> new IllegalArgumentException("Usuario não encontrado"));
        Post post = postOptional.get();
        if (likeService.buscarPorUserEPost(user, post).isEmpty()) {
            Like like = new Like(user, post);
            likeService.like(like);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }
    @DeleteMapping("/{id}/dislike")
    public ResponseEntity<Void> dislikePost(@PathVariable("id") UUID id, Authentication authentication) {
        if (id == null) {
            return ResponseEntity.badRequest().build();
        }
        Optional<Post> postOptional = postService.buscarporId(id);
        if (postOptional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        User user = userService.buscarPorUsername(authentication.getName()).orElseThrow(() -> new IllegalArgumentException("Usuario não encontrado"));
        Post post = postOptional.get();
        Optional<Like> likeOptional = likeService.buscarPorUserEPost(user, post);
        if (likeOptional.isPresent()) {
            Like like = likeOptional.get();
            likeService.dislike(like);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> exluirPostPorId(@PathVariable("id") UUID id, Authentication authentication) {
        User user = userService.buscarPorUsername(authentication.getName()).orElseThrow(() -> new IllegalArgumentException("Usuario não encontrado"));
        Post post = postService.buscarporId(id).orElseThrow(() -> new IllegalArgumentException("Post não existe"));
        if (post.getUser().getId() != user.getId()) {
            throw new IllegalArgumentException("Só é possível deletar posts que você criou");
        }
        postService.deletar(post);
        return ResponseEntity.noContent().build();
    }
}
