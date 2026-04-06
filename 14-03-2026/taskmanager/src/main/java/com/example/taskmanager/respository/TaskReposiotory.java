package com.example.taskmanager.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.taskmanager.entity.TaskEntity;

public interface TaskReposiotory extends JpaRepository<TaskEntity,Long> {
    
}
