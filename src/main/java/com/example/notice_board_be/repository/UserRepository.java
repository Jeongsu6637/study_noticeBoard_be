package com.example.notice_board_be.repository;

import com.example.notice_board_be.domain.entity.User;
import com.example.notice_board_be.domain.response.UserResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {

    UserResponse findUserByEmailAndPw(String email, String pw);

//    @Query("select u from User u where u.email=:email")
//    UserResponse findByEmail(String email);

}
