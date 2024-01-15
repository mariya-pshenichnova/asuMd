package com.example.asuMd.service;

import com.example.asuMd.model.User;
import com.example.asuMd.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    @Autowired
    private final UserRepository userRepository;

    @Override
    public User registration(User user) {
        return userRepository.save(user);
    }

    @Override
    public User modify(User user) {
        return userRepository.save(user);
    }
}
