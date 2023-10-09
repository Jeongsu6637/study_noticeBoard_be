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

    public List<BoardResponse> findAll(){
        List<Board> all = boardRepository.findAll();
        for (int i = 0; i < all.size(); i++) {
            Board board = all.get(i);
            List<BoardResponse> list = all.stream().map((e) -> new BoardResponse(board.getBoardId(), board.getTitle(), board.getContent(), board.getName(), board.getCreateAt())).toList();
            return list;
        }
        return null;
    }


}
