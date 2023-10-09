package com.example.notice_board_be.domain.response;

import java.time.LocalDateTime;

public record UserResponse(
        String email,
        String pw,
        String name,
        LocalDateTime createAt
) {
}
