package com.example.notice_board_be.controller;

import com.example.notice_board_be.domain.request.UserLoginRequest;
import com.example.notice_board_be.domain.request.SignupReqeust;
import com.example.notice_board_be.domain.response.UserResponse;
import com.example.notice_board_be.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
@CrossOrigin("*")
public class UserController {
    private final UserService userService;

    @PostMapping("/signup")
    public void save(@RequestBody SignupReqeust reqeust){
        userService.save(reqeust);
    }

    @PostMapping("/login")
    public UserResponse login(@RequestBody UserLoginRequest request){
        return userService.login(request);
    }

//    @GetMapping("/{email}")
//    public UserResponse getByEmail(@PathVariable("email") String email){
//        return userService.getByEmail(email);
//    }


}
