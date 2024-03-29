package com.newcoder.community.service;

import com.newcoder.community.entity.User;
import com.newcoder.community.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User findUserById(int id){
        return userMapper.SelectById(id);

    }

}
