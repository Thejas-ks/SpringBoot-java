package com.example.students.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.students.dto.req.studentRequest;
import com.example.students.dto.response.ApiResponse;
import com.example.students.dto.response.studentResponse;
import com.example.students.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
        
    @PostMapping("/call")
    public ApiResponse getResults(@RequestBody studentRequest request){

        studentResponse result = studentService.calstudentResponse(request);

       return new ApiResponse("success", result);
    }
}
