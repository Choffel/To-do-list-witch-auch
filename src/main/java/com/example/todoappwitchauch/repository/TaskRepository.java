package com.example.todoappwitchauch.repository;

import com.example.todoappwitchauch.models.Task;
import com.example.todoappwitchauch.enums.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {


    List<Task> findByTitle(String title);

    List<Task> findByStatus(TaskStatus status);

    void deleteByTitle(String title);
}