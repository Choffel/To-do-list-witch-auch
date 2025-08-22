package com.example.todoappwitchauch.dtos.TastDTOs;

public class CreateTask {
    private String title;
    private String description;

    public CreateTask(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public CreateTask() {}

    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
}
