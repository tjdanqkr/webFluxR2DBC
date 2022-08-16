package com.example.webflux2.user.service;

import com.example.webflux2.user.entity.Users;
import reactor.core.publisher.Flux;

public interface UserService {
    Flux<Users> findALl();

}
