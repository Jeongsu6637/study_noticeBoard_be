package com.example.notice_board_be.repository;

import com.example.notice_board_be.domain.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface BoardRepository extends JpaRepository<Board, Long> {

//    @Query("select b from Board b order by b.boardId desc")
//    Optional<Board> findByAll();

}
