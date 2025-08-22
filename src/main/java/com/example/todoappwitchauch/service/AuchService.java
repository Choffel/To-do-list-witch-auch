package com.example.todoappwitchauch.service;

import com.example.todoappwitchauch.dtos.UserDTOs.RegistrUser;
import com.example.todoappwitchauch.enums.Roles;
import com.example.todoappwitchauch.models.User;
import com.example.todoappwitchauch.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class AuchService {

    private final UserRepository userRepository;

    public AuchService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(RegistrUser registrUser) {
        User user = new User();

        user.setUsername(registrUser.getUsername());
        user.setPassword(registrUser.getPassword());
        user.setEmail(registrUser.getEmail());
        user.setRole(Roles.USER);
        return userRepository.save(user);
    }
}
