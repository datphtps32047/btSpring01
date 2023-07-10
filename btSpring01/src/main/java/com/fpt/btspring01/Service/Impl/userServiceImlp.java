package com.fpt.btspring01.Service.Impl;

import com.fpt.btspring01.Model.user;
import com.fpt.btspring01.Repository.UserRepository;
import com.fpt.btspring01.Service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class userServiceImlp implements userService {
    private final UserRepository userRepository;
    @Autowired
    public userServiceImlp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public user saveUser(user user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<user> getUserById(Long userId) {
        return userRepository.findById(userId);
    }

    @Override
    public List<user> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUserById(Long userId) {
        userRepository.deleteById(userId);
    }
}
