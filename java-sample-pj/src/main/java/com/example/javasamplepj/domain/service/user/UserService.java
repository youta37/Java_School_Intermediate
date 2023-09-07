package com.example.javasamplepj.domain.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.javasamplepj.domain.model.user.User;
import com.example.javasamplepj.domain.repository.UserRepository;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> searchAll() {
        return userRepository.findAll();
    }
}