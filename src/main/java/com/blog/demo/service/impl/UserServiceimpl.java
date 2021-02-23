package com.blog.demo.service.impl;

import com.blog.demo.dao.UserRespository;
import com.blog.demo.entity.User;
import com.blog.demo.service.UserService;
import com.blog.demo.util.MD5Utils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceimpl implements UserService {

    @Resource
    UserRespository userRespository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRespository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
