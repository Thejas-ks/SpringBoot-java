package com.example.students.dto.response;

public class ApiResponse {

    private String status;
    private studentResponse data;
    public ApiResponse(String status, studentResponse data) {
        this.status = status;
        this.data = data;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public studentResponse getData() {
        return data;
    }
    public void setData(studentResponse data) {
        this.data = data;
    }

    
    
}
