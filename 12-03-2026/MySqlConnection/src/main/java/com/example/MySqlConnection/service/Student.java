package com.example.MySqlConnection.service;

import org.springframework.stereotype.Service;

import com.example.MySqlConnection.dto.rerquest.StudentRequest;
import com.example.MySqlConnection.dto.response.StudentResponse;
import com.example.MySqlConnection.entity.RegisterNumberEntity;
import com.example.MySqlConnection.entity.StudentModel;
import com.example.MySqlConnection.repository.RegistrationNumberRepository;
import com.example.MySqlConnection.repository.StudentRepository;

@Service
public class Student {
    private final StudentRepository studentRepository;
    private final RegistrationNumberRepository registrationNumberRepository; 
    
    public Student(StudentRepository studentRepository, RegistrationNumberRepository registrationNumberRepository) {
        this.studentRepository = studentRepository;
        this.registrationNumberRepository = registrationNumberRepository;
    }

    public StudentResponse studentResponse(StudentRequest studentRequest)
    {
        StudentModel sm = new StudentModel();
        sm.setName(studentRequest.getName());

         StudentModel studentModel = studentRepository.save(sm);

        return new StudentResponse(studentModel.getId(), studentModel.getName(),null);

    }

    public StudentResponse asssign(Long studentId,String regNumber){
        StudentModel studentModel = studentRepository.findById(studentId).orElseThrow(()-> new RuntimeException("Student bnot found"));

        RegisterNumberEntity registerNumberEntity = new RegisterNumberEntity();
        registerNumberEntity.setRegNumber(regNumber);

        RegisterNumberEntity savedreg = registrationNumberRepository.save(registerNumberEntity);
        studentModel.setRegisterNumberEntity(savedreg);
        studentRepository.save(studentModel);

        return new StudentResponse(studentModel.getId(), studentModel.getName(), savedreg.getRegNumber());
    }
    
}
