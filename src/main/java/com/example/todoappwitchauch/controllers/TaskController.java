package com.example.todoappwitchauch.controllers;

import com.example.todoappwitchauch.dtos.TaskDTOs.CreateTask;
import com.example.todoappwitchauch.dtos.TaskDTOs.TaskResponse;
import com.example.todoappwitchauch.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TaskController {
    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/create-task")
    public ResponseEntity<TaskResponse> createTask(@RequestBody CreateTask createTask) {
        TaskResponse taskResponse = taskService.createTask(createTask);

        return ResponseEntity.ok(taskResponse);
    }

    @GetMapping("get-all-tasks")
    public List<TaskResponse> getAllTasks() {
        return taskService.getAllTasks();
    }
}
