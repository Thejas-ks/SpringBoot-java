package com.example.taskmanager.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.taskmanager.dto.request.TaskRequest;
import com.example.taskmanager.dto.response.ApiResponse;
import com.example.taskmanager.dto.response.TaskResponse;
import com.example.taskmanager.entity.TaskEntity;
import com.example.taskmanager.service.TaskService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    
    @PostMapping("/bulk")
    public ApiResponse<List<TaskResponse>> createTApiResponse(@Valid @RequestBody List<TaskRequest> req){
        List<TaskResponse> responses = taskService.gTaskResponses(req);
      return new ApiResponse<List<TaskResponse>>("success", responses);

}
@GetMapping
public ApiResponse<Page<TaskEntity>> getTask(Pageable pageable){
    Page<TaskEntity> resPage = taskService.gTaskEntities(pageable);
    return new ApiResponse<Page<TaskEntity>>("success", resPage);
}
}
