package com.example.SpringDatabase.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringDatabase.dto.request.StudentRequest;
import com.example.SpringDatabase.dto.response.ApiResponse;
import com.example.SpringDatabase.dto.response.StudentResponse;
import com.example.SpringDatabase.service.StudentServive;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentServive studentServive;

   
    public StudentController(StudentServive studentServive) {
        this.studentServive = studentServive;
    }

    @PostMapping("/cal")
    public ApiResponse<StudentResponse> getresults(@RequestBody StudentRequest studentrequest){
        StudentResponse results = studentServive.process(studentrequest);
        return new ApiResponse<StudentResponse>("success", results);    }
}
