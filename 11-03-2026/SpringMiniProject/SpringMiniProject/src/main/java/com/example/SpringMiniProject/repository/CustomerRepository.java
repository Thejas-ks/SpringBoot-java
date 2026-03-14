package com.example.SpringMiniProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringMiniProject.entity.customer;

public interface CustomerRepository extends JpaRepository<customer,Long> {

    
} 
    
