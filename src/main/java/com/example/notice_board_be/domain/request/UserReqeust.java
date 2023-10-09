package com.example.notice_board_be.domain.request;

import com.example.notice_board_be.domain.entity.User;

public record UserReqeust(String email,
                          String pw,
                          String name) {

    public User toEntity(){
        return User.builder()
                .email(email)
                .pw(pw)
                .name(name)
                .build();
    }
}
