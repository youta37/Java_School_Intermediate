package com.example.javasamplepj.domain.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.javasamplepj.domain.mapper.UserMapper;
import com.example.javasamplepj.domain.model.user.User;

@Repository
public class UserRepository {

    @Autowired
    private UserMapper userMapper;

    public List<User> findAll() {
        return userMapper.findAll();
    }

}
