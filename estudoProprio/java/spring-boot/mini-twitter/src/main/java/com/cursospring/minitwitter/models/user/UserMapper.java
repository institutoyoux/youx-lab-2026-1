package com.cursospring.minitwitter.models.user;

import com.cursospring.minitwitter.models.user.dto.UserResponseDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserResponseDto toUserResponseDto(User user) {
        return new UserResponseDto(user.getId(), user.getUsername(), user.getEmail(), user.getUrlFoto());
    }
}
