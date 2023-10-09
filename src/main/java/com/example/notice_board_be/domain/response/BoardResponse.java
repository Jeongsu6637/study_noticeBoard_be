package com.example.notice_board_be.domain.response;


import java.time.LocalDateTime;

public record BoardResponse(
        Long boardId,
        String title,
        String content,
        String name,
        LocalDateTime createAt
) {
}
