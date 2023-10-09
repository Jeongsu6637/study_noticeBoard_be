package com.example.notice_board_be.service;

import com.example.notice_board_be.domain.request.UserLoginRequest;
import com.example.notice_board_be.domain.request.SignupReqeust;
import com.example.notice_board_be.domain.response.UserResponse;
import com.example.notice_board_be.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void save(SignupReqeust reqeust){
        userRepository.save(reqeust.toEntity());
    }

    public UserResponse login(UserLoginRequest request){
        return userRepository.findUserByEmailAndPw(request.email(), request.pw());
    }

//    public UserResponse getByEmail(String email){
//        return userRepository.findByEmail(email);
//    }




}
