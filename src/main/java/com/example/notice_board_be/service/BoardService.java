package com.example.notice_board_be.service;

import com.example.notice_board_be.domain.entity.Board;
import com.example.notice_board_be.domain.request.BoardReqeust;
import com.example.notice_board_be.domain.response.BoardResponse;
import com.example.notice_board_be.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public void save(BoardReqeust reqeust){
        boardRepository.save(reqeust.toEntity());
    }

    public BoardResponse findAll(){
        Optional<Board> all = boardRepository.findByAll();
        Board board = all.get();
        return new BoardResponse(board.getBoardId(), board.getTitle(), board.getContent(), board.getName(), board.getCreateAt());
    }

}
