package com.example.pricecalculation.Service;

import org.springframework.stereotype.Service;

import com.example.pricecalculation.dto.Request.PriceCalculationRequest;
import com.example.pricecalculation.dto.Response.PriceCalculationResponse;

@Service
public class PriceCalculationService {
    public PriceCalculationResponse calPriceCalculation(PriceCalculationRequest req){
        int total = 0;
        total = req.getProd1()+req.getProd2()+req.getProd3()+req.getProd4()+req.getProd5()+req.getProd6()+req.getProd7()+req.getProd8()+req.getProd9()+req.getProd10();
        double gst = 18;
        double gstamount = (gst/100)*total;
        double netAmount = gst+total;

        return new PriceCalculationResponse(req.getCustomerName(),req.getCustId(), total, gstamount,netAmount);
    }
    
}
