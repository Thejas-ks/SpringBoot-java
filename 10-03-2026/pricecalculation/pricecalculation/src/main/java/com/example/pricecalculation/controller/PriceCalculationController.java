package com.example.pricecalculation.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pricecalculation.Service.PriceCalculationService;
import com.example.pricecalculation.dto.Request.PriceCalculationRequest;
import com.example.pricecalculation.dto.Response.ApiResponse;
import com.example.pricecalculation.dto.Response.PriceCalculationResponse;

@RestController
@RequestMapping("/customer")
public class PriceCalculationController {
    
    private final PriceCalculationService priceCalculationService;

    public PriceCalculationController(PriceCalculationService priceCalculationService) {
        this.priceCalculationService = priceCalculationService;
    }
    
    @PostMapping("/cal")
    public ApiResponse getresults(@RequestBody PriceCalculationRequest request){
        PriceCalculationResponse results = priceCalculationService.calPriceCalculation(request);
        return new ApiResponse(results);
    }
}
