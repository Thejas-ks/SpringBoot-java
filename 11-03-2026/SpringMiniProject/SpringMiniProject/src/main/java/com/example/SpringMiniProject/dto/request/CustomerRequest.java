package com.example.SpringMiniProject.dto.request;

import java.util.List;

public class CustomerRequest {

    private String name;
    List<Integer> price;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Integer> getPrice() {
        return price;
    }
    public void setPrice(List<Integer> price) {
        this.price = price;
    }
    
    
}
