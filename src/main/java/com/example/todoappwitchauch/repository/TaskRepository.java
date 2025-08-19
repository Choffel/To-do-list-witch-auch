package com.example.todoappwitchauch.repository;

import com.example.todoappwitchauch.dto.Task;
import com.example.todoappwitchauch.enums.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {


    List<Task> findByTitle(String title);

    List<Task> findByStatusOrderByCreatedAtDesc(TaskStatus status);

    List<Task> findByStatusAndAuthorIdOrderByCreatedAtDesc(TaskStatus status, Long authorId);

    void deleteByTitle(String title);
}