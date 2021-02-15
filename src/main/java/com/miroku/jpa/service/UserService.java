package com.miroku.jpa.service;

import javax.transaction.Transactional;

import com.miroku.jpa.model.User;
import com.miroku.jpa.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void save(User user) {
        userRepository.save(user);
    }
}
