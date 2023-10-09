package com.example.notice_board_be.domain.request;

import com.example.notice_board_be.domain.entity.Board;

public record BoardReqeust(String title,
                           String content,
                           String name) {

    public Board toEntity(){
        return Board.builder()
                .title(title)
                .content(content)
                .name(name)
                .build();
    }
}
