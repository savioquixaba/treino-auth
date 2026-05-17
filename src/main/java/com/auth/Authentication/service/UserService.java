package com.auth.Authentication.service;

import com.auth.Authentication.entity.User;
import com.auth.Authentication.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User save( User user){
        return userRepository.save(user);
    }


}
