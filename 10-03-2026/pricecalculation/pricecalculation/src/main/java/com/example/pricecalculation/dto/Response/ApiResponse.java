package com.example.pricecalculation.dto.Response;

public class ApiResponse {
    
    private PriceCalculationResponse data;

    public ApiResponse(PriceCalculationResponse data) {
        this.data = data;
    }

    public PriceCalculationResponse getData() {
        return data;
    }

    public void setData(PriceCalculationResponse data) {
        this.data = data;
    }

    
}
