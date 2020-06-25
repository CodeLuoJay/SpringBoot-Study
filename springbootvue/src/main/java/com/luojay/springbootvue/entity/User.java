package com.luojay.springbootvue.entity;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private List<String> roles;
    private String introduction;
    private String avatar;
    private String name;
    private String username;
    private String password;
}
