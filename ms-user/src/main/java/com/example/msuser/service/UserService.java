package com.example.msuser.service;

import com.example.msuser.entity.User;

public interface UserService {

    User registerUser(User input);
    Iterable<User> findAll();

}