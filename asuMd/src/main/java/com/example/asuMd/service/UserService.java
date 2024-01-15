package com.example.asuMd.service;

import com.example.asuMd.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User registration(User user);
    User modify(User user);
}
