package com.example.MySqlConnection.dto.response;

public class ApiStudent<T> {

    private String status;
    private T data;

    
    public ApiStudent(String status, T data) {
        this.status = status;
        this.data = data;
    }
    
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }

    
    
}
