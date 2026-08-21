package com.cursospring.minitwitter.controllers;

import com.cursospring.minitwitter.models.post.dto.PostResponseDto;
import com.cursospring.minitwitter.models.user.User;
import com.cursospring.minitwitter.models.user.dto.ProfileResponseDto;
import com.cursospring.minitwitter.models.user.dto.UserResponseDto;
import com.cursospring.minitwitter.services.LikeService;
import com.cursospring.minitwitter.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

    private final UserService userService;
    private final LikeService likeService;

    @GetMapping("/me")
    public ResponseEntity<UserResponseDto> getMe(Authentication authentication) {
        String username = authentication.getName();
        User user = userService.buscarPorUsername(username).orElseThrow(() -> new IllegalArgumentException("Usuario não encontrado"));
        UserResponseDto response = new UserResponseDto(user.getId(), user.getUsername(), user.getEmail(), user.getUrlFoto());
        return ResponseEntity.ok(response);
    }

    @GetMapping("/posts")
    public ResponseEntity getMePosts(Authentication authentication) {
        String username = authentication.getName();
        return ResponseEntity.ok(userService.buscarPorUsername(username).orElseThrow(() -> new IllegalArgumentException("Usuario não encontrado")).getPosts());
    }
    @GetMapping("/{username}")
    public ResponseEntity<ProfileResponseDto> getByUsername(@PathVariable("username") String username) {
        if (username == null) {
            throw new IllegalArgumentException("Username não pode estar vazio");
        }
        User user = userService.buscarPorUsername(username).orElseThrow(() -> new IllegalArgumentException("Usuario não encontrado"));
        ProfileResponseDto responseDto = new ProfileResponseDto(user.getId(), user.getUsername(), user.getUrlFoto());
        return ResponseEntity.ok().body(responseDto);
    }

    @GetMapping("/{username}/posts")
    public ResponseEntity<List<PostResponseDto>> getPostsByUsername(@PathVariable("username") String username) {
        if (username == null) {
            throw new IllegalArgumentException("Username não pode estar vazio");
        }
        User user = userService.buscarPorUsername(username).orElseThrow(() -> new IllegalArgumentException("Usuario não encontrado"));
        UserResponseDto responseDto = new UserResponseDto(user.getId(), user.getUsername(), user.getEmail(), user.getUrlFoto());
        List<PostResponseDto> posts = user.getPosts()
                .stream()
                .map(post ->
                        new PostResponseDto(
                                post.getId(),
                                post.getDataCriacao(),
                                post.getConteudo(),
                                post.getLikes().size(),
                                likeService.verLikedPorIds(post.getId(), user.getId()),
                                responseDto, user.getId() == post.getUser().getId()))
                .toList();
        return ResponseEntity.ok(posts);
    }
}
