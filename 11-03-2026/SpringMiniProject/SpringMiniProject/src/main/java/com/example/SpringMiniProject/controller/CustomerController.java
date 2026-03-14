package com.example.SpringMiniProject.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringMiniProject.dto.request.CustomerRequest;
import com.example.SpringMiniProject.dto.response.ApiCustomer;
import com.example.SpringMiniProject.dto.response.CustomerResponse;
import com.example.SpringMiniProject.service.CustomerServive;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    
    private final CustomerServive customerServive;

    public CustomerController(CustomerServive customerServive) {
        this.customerServive = customerServive;
    }
    
    @PostMapping("/cal")
    public ApiCustomer<CustomerResponse> getresults(@RequestBody CustomerRequest req){

        CustomerResponse results = customerServive.customerResponse(req);
        return new ApiCustomer<CustomerResponse>("success", results);
    }

@GetMapping("/result")
public ApiCustomer<List<CustomerResponse>> getAllCustomerResults(){
    List<CustomerResponse> result = customerServive.getAllCustomerResponseResults();
    return new ApiCustomer<List<CustomerResponse>>("success", result);
}
}

   


