package com.example.MySqlConnection.dto.response;

public class StudentResponse {
    private Long id;
    private String name;
    private String registrationNUmber;

    public StudentResponse(Long id, String name, String registrationNUmber) {
        this.id = id;
        this.name = name;
        this.registrationNUmber = registrationNUmber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationNUmber() {
        return registrationNUmber;
    }

    public void setRegistrationNUmber(String registrationNUmber) {
        this.registrationNUmber = registrationNUmber;
    }
    
    
}
