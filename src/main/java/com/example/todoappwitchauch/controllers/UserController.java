package com.example.todoappwitchauch.controllers;

import com.example.todoappwitchauch.dto.User;
import com.example.todoappwitchauch.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @PostMapping("registr")
    public String register(@RequestBody User user) {
        user.setId(null);
        userRepository.save(user);
        return "Registrado com sucesso!";
    }

    @GetMapping("/serch-by-username")
    public List<User> findByUsername(@RequestParam String username) {
        userRepository.findByUsername(username);
        return userRepository.findAll();
    }
}
