package com.example.MySqlConnection.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MySqlConnection.entity.StudentModel;

public interface StudentRepository extends JpaRepository<StudentModel,Long> {
    
}
