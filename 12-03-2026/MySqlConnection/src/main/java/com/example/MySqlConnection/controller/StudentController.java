package com.example.MySqlConnection.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MySqlConnection.dto.rerquest.RegisterRequest;
import com.example.MySqlConnection.dto.rerquest.StudentRequest;
import com.example.MySqlConnection.dto.response.ApiStudent;
import com.example.MySqlConnection.dto.response.StudentResponse;
import com.example.MySqlConnection.service.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
     private final Student student;

     public StudentController(Student student) {
        this.student = student;
     }
     
     @PostMapping("/call")
     public ApiStudent<StudentResponse> studentResponse(@RequestBody StudentRequest req){

        StudentResponse results = student.studentResponse(req);
       return new ApiStudent<>("success", results);

     }

   @PostMapping("/{id}/register")
   public ApiStudent<StudentResponse> assignRegister(@PathVariable Long id,@RequestBody RegisterRequest registerNumber ){
      StudentResponse response = student.asssign(id,registerNumber.getRergistrationNumber());
      return new ApiStudent<StudentResponse>("success", response);
   }
      
      
     }



