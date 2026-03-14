package com.example.SpringDatabase.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.SpringDatabase.dto.request.StudentRequest;
import com.example.SpringDatabase.dto.response.StudentResponse;
import com.example.SpringDatabase.entity.Student;
import com.example.SpringDatabase.repository.StudentRepository;

@Service
public class StudentServive {
    
    private final StudentRepository studentrepository;

    public StudentServive(StudentRepository studentrepository) {
        this.studentrepository = studentrepository;
    }

    public StudentResponse process(StudentRequest req){
        int total = req.getMark().stream().mapToInt(Integer::intValue).sum();
        int subjects = req.getMark().size();
        double percentage = (double)total/subjects;
        String result = percentage>75?"PASS":"FAIL";

        Student student = new Student();

        student.setName(req.getName());
        student.setRollNumber(req.getRollNumber());
        student.setPercentage(percentage);
        student.setResult(result);

        studentrepository.save(student);

        return new StudentResponse(req.getName(),req.getRollNumber(), total, percentage, result);
    }
}

public List<StudentResponse>getAllStudentResult(){
        return studentrepository.findAll().stream().map(student -> new StudentResponse(
        student.getName(), 
        student.getRollNumber(),
        student.getTotal(),
         student.getPercentage(), 
         student.getResult())).toList();

    }

    
       
