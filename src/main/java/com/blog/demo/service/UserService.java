package com.blog.demo.service;


import com.blog.demo.entity.User;

public interface UserService {

    User checkUser(String username, String password);
}
