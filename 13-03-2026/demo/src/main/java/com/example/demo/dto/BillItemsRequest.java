package com.example.demo.dto;

import lombok.Data;

@Data
public class BillItemsRequest {
    
    private Long billId;
    private Long prodId;
    private Integer qty;
    
}
