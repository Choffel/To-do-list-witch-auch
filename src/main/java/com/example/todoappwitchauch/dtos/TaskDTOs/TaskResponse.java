package com.example.todoappwitchauch.dtos.TastDTOs;

import java.time.LocalDate;

public class TaskResponse {
    private Long id;
    private String title;
    private String description;
    private String status;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private AuthorInfo author;

    public TaskResponse() {}


    public TaskResponse(Long id, String title, String description, String status,
                        LocalDate createdAt, LocalDate updatedAt, AuthorInfo author) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.author = author;
    }


    public static class AuthorInfo {
        private Long id;
        private String username;
        private String email;

        public AuthorInfo() {}

        public AuthorInfo(Long id, String username, String email) {
            this.id = id;
            this.username = username;
            this.email = email;
        }

        // Геттеры и сеттеры
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }

        public String getUsername() { return username; }
        public void setUsername(String username) { this.username = username; }

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
    }

    // Геттеры и сеттеры
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public LocalDate getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDate createdAt) { this.createdAt = createdAt; }

    public LocalDate getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDate updatedAt) { this.updatedAt = updatedAt; }

    public AuthorInfo getAuthor() { return author; }
    public void setAuthor(AuthorInfo author) { this.author = author; }
}
