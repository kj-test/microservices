package com.example.msmail.service;

import com.example.msmail.entity.dto.UserDto;

public interface EmailService {

    void sendSimpleMessage(UserDto input);

}