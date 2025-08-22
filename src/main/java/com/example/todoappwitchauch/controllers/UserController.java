package com.example.todoappwitchauch.controllers;

import com.example.todoappwitchauch.dtos.UserDTOs.RegistrUser;
import com.example.todoappwitchauch.repository.UserRepository;
import com.example.todoappwitchauch.service.AuchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private final UserRepository userRepository;
    private final AuchService auchService;

    @Autowired
    public UserController(UserRepository userRepository, AuchService auchService) {
        this.userRepository = userRepository;
        this.auchService = auchService;
    }


    @PostMapping("/registr")
    public ResponseEntity<RegistrUser> registerUser(@RequestBody RegistrUser registrUser) {
        var saverUser = auchService.registerUser(registrUser);

        return ResponseEntity.ok().body(registrUser);
    }

}
