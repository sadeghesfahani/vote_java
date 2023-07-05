package com.sadeghesfahani.sina.vote.user.services;

import com.sadeghesfahani.sina.vote.user.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
