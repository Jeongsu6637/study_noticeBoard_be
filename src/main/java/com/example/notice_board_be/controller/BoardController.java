package com.example.notice_board_be.controller;

import com.example.notice_board_be.domain.request.BoardReqeust;
import com.example.notice_board_be.domain.response.BoardResponse;
import com.example.notice_board_be.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/board")
@CrossOrigin("*")
public class BoardController {
    private final BoardService boardService;

    @PostMapping
    public void save(@RequestBody BoardReqeust reqeust){
        boardService.save(reqeust);
    }

    @GetMapping
    public List<BoardResponse> getAll(){
        return boardService.findAll();
    }


}
