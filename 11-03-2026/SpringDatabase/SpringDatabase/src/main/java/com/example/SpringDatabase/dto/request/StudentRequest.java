package com.example.SpringDatabase.dto.request;

import java.util.List;

public class StudentRequest {
    private String name;
    private int rollNumber;
    private List<Integer>mark;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    public List<Integer> getMark() {
        return mark;
    }
    public void setMark(List<Integer> mark) {
        this.mark = mark;
    }

    
}
