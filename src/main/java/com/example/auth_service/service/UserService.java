package com.example.auth_service.service;


import com.example.auth_service.entity.User;
import com.example.auth_service.entity.UserStatus;
import com.example.auth_service.entity.UserType;
import com.example.auth_service.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public User createUser(String email, String rawPassword, UserType userType) {

        User user = User.builder()
                .email(email)
                .password(passwordEncoder.encode(rawPassword))
                .userType(userType)
                .status(UserStatus.ACTIVE)
                .build();

        return userRepository.save(user);
    }
}
