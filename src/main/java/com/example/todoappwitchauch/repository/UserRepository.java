package com.example.todoappwitchauch.repository;

import com.example.todoappwitchauch.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    
}