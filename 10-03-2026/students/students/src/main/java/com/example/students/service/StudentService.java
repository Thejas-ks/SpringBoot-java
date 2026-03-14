package com.example.students.service;

import org.springframework.stereotype.Service;

import com.example.students.dto.req.studentRequest;
import com.example.students.dto.response.studentResponse;

@Service
public class StudentService {
    public studentResponse calstudentResponse(studentRequest req){

        int total = 0;
        total = req.getMark1()+req.getMark2()+req.getMark3()+req.getMark4()+req.getMark5();
        double percentage = total/5.0;
        String result = percentage >=75 ? "Pass":"Fail";

        return new studentResponse(req.getName(),req.getRollNumber(), total, percentage, result);
    }
}
