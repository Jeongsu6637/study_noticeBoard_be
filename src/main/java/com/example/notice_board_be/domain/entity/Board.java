package com.example.notice_board_be.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter @Entity @Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Table(name = "boards")
public class Board {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardId;
    private String title;
    private String content;
    private String name;
    private LocalDateTime createAt;

    @PrePersist
    public void prePersist(){
        this.createAt=LocalDateTime.now();
    }

}
