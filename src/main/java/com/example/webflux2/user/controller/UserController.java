package com.example.webflux2.user.controller;

import com.example.webflux2.user.entity.Users;
import com.example.webflux2.user.repository.UserMapper;
import com.example.webflux2.user.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserMapper userMapper;
    @GetMapping()
    public Flux<Users> getUserList(){
        return userMapper.findAll();
    }
}
