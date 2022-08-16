package com.example.webflux2.user.service;

import com.example.webflux2.user.entity.Users;
import com.example.webflux2.user.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;
    @Override
    public Flux<Users> findALl() {
        return userMapper.findAll();
    }
}
