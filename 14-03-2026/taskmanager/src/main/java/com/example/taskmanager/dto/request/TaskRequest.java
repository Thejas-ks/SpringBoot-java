package com.example.taskmanager.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class TaskRequest {

    @NotBlank(message ="Title should not be empty!")
    private String title;

    @NotBlank(message= "Should not be empty!")
    private String description;
    
    @Positive
    private Integer priority;


    
}
