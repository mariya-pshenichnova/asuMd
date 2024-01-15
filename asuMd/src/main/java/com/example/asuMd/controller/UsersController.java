package com.example.asuMd.controller;

import com.example.asuMd.model.User;
import com.example.asuMd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    @Autowired
    private UserService userService;
    @PostMapping("/")
    public void registerUser(User user) {
        userService.registration(user);
    }
}
