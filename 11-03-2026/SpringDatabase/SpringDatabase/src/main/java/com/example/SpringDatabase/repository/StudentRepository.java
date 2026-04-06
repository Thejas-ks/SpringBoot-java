package com.example.SpringDatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringDatabase.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{
    
}
