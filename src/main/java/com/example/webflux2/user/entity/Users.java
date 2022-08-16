package com.example.webflux2.user.entity;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

@Data
public class Users {
    private Long id;
    private String userId;
    private String img;
    private String name;
    private String password;
}
