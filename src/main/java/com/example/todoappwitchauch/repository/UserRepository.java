package com.example.todoappwitchauch.repository;

import com.example.todoappwitchauch.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);

    List<User> findByRole(String role);
    List<User> findByUsernameContainingIgnoreCase(String usernamePart);

    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
}