package com.example.demo.dto;

import lombok.Data;

@Data
public class BillItemsResponse {

    private Long id;
    private Long billId;
    private Long prodId;
    private Integer qty;
    private double mrp;
    private double tax;
    private double total;
}
