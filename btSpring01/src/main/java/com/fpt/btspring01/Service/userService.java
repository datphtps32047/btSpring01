package com.fpt.btspring01.Service;

import com.fpt.btspring01.Model.user;

import java.util.List;
import java.util.Optional;

public interface userService {
    user saveUser(user user);
    Optional<user> getUserById(Long userId);
    List<user> getAllUsers();
    void deleteUserById(Long userId);
}
