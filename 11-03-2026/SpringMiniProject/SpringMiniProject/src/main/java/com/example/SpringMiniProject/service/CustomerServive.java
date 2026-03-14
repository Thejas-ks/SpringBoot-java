package com.example.SpringMiniProject.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.SpringMiniProject.dto.request.CustomerRequest;
import com.example.SpringMiniProject.dto.response.CustomerResponse;
import com.example.SpringMiniProject.entity.customer;
import com.example.SpringMiniProject.repository.CustomerRepository;

@Service
public class CustomerServive {

    private final CustomerRepository customerrepository;

    public CustomerServive(CustomerRepository customerrepository) {
        this.customerrepository = customerrepository;
    }
    
    public CustomerResponse customerResponse(CustomerRequest custreq){
        int total = custreq.getPrice().stream().mapToInt(Integer::intValue).sum();
        double gst = (18.0/100)*total;
        int netTotal = (int)gst+total;

        customer cust1 = new customer();

        cust1.setName(custreq.getName());
        cust1.setTotal(total);
        cust1.setGst(gst);
        cust1.setNettotal(netTotal);

        customerrepository.save(cust1);
         return new CustomerResponse(custreq.getName(),total, gst,netTotal);
    }

   public List<CustomerResponse> getAllCustomerResponseResults() {

    return customerrepository.findAll()
            .stream()
            .map(cust -> new CustomerResponse(
                    cust.getName(),
                    cust.getTotal(),
                    cust.getGst(),
                    cust.getNettotal()
            ))
            .toList();
}
   
    
}
