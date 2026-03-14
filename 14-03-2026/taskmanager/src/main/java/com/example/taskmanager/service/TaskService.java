package com.example.taskmanager.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.taskmanager.dto.request.TaskRequest;

import com.example.taskmanager.dto.response.TaskResponse;
import com.example.taskmanager.entity.TaskEntity;
import com.example.taskmanager.respository.TaskReposiotory;

@Service
public class TaskService {
    private final TaskReposiotory taskReposiotory;

    public TaskService(TaskReposiotory taskReposiotory) {
        this.taskReposiotory = taskReposiotory;
    }
    
    public List<TaskResponse> gTaskResponses(List<TaskRequest> taskRequests ){

        List<TaskEntity> taskres = taskRequests.stream().map(req->{
            TaskEntity entity = new TaskEntity();
            entity.setTitle(req.getTitle());
            entity.setDescription(req.getDescription());
            entity.setPriority(req.getPriority());
            return entity;
                }).collect(Collectors.toList());

    List<TaskEntity> savedTaskEntities = taskReposiotory.saveAll(taskres);
    
                return savedTaskEntities.stream().map( task -> {

                    TaskResponse res = new TaskResponse();
                    res.setId(task.getId());
                    res.setTitle(task.getTitle());
                    res.setDescription(task.getDescription());
                    res.setPriority(task.getPriority());
                    return res;
                }).collect(Collectors.toList());
   
}

public org.springframework.data.domain.Page<TaskEntity> gTaskEntities(org.springframework.data.domain.Pageable pageable){
 return taskReposiotory.findAll(pageable);
}
}
