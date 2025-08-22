package com.example.todoappwitchauch.service;

import com.example.todoappwitchauch.dtos.TaskDTOs.CreateTask;
import com.example.todoappwitchauch.dtos.TaskDTOs.TaskResponse;
import com.example.todoappwitchauch.enums.TaskStatus;
import com.example.todoappwitchauch.models.Task;
import com.example.todoappwitchauch.repository.TaskRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskService {

    private final TaskRepository taskRepository;
    private final ModelMapper modelMapper;


    @Autowired
    public TaskService(TaskRepository taskRepository, ModelMapper modelMapper) {
        this.taskRepository = taskRepository;
        this.modelMapper = modelMapper;
    }

    public TaskResponse createTask(CreateTask createTask) {
        Task task = new Task();

        task.setTitle(createTask.getTitle());
        task.setDescription(createTask.getDescription());
        task.setStatus(TaskStatus.PENDING);
        task.setCreatedAt(LocalDate.now());
        task.setUpdatedAt(LocalDate.now());

        Task savedTask = taskRepository.save(task);

        return modelMapper.map(savedTask, TaskResponse.class);

    }

    public List<TaskResponse> getAllTasks() {
        return taskRepository.findAll().stream()
                .map(task -> modelMapper.map(task, TaskResponse.class))
                .collect(Collectors.toList());
    }}
