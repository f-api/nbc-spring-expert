package org.example.springexpert.dto.todo.response;

import lombok.Getter;
import org.example.springexpert.dto.user.UserDto;
import org.example.springexpert.entity.User;

import java.time.LocalDateTime;

@Getter
public class TodoUpdateResponseDto {

    private final Long id;
    private final UserDto user;
    private final String title;
    private final String content;
    private final LocalDateTime createdAt;
    private final LocalDateTime modifiedAt;

    public TodoUpdateResponseDto(
            Long id,
            User user,
            String title,
            String content,
            LocalDateTime createdAt,
            LocalDateTime modifiedAt
    ) {
        this.id = id;
        this.user = new UserDto(
                user.getId(),
                user.getUsername(),
                user.getEmail()
        );
        this.title = title;
        this.content = content;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }
}
