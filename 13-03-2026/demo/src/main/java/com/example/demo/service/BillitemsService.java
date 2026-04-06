package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.BillItemsRequest;
import com.example.demo.dto.BillItemsResponse;
import com.example.demo.entity.BillItemsEntity;
import com.example.demo.entity.BillsEntity;
import com.example.demo.entity.ProductEntity;
import com.example.demo.repository.BillItemsRepository;
import com.example.demo.repository.BillRepository;
import com.example.demo.repository.ProductRepository;



@Service
public class BillitemsService {
    
    private final BillItemsRepository billItemsRepository;
    private final BillRepository billRepository;
    private final ProductRepository productRepository;

    public BillitemsService(BillItemsRepository billItemsRepository, BillRepository billRepository,
        ProductRepository productRepository) {
        this.billItemsRepository = billItemsRepository;
        this.billRepository = billRepository;
        this.productRepository = productRepository;
    }

    public BillItemsResponse getItemsResponse(BillItemsRequest req){

        BillsEntity bEntity = billRepository.findById(req.getBillId()).orElseThrow();
        ProductEntity productEntity = productRepository.findById(req.getProdId()).orElseThrow();

        double price = productEntity.getProdMrp();
        double total = price * req.getQty();
        double tax =  (productEntity.getProdTax() * total)/100;

        BillItemsEntity billItemsEntity = new BillItemsEntity();
        billItemsEntity.setQty(req.getQty());
        
        BillItemsEntity savedBillItemsEntity= billItemsRepository.save(billItemsEntity);

        BillItemsResponse res = new BillItemsResponse();
        res.setId(savedBillItemsEntity.getId());
        res.setProdId(savedBillItemsEntity.getProductEntity().getId());
        res.setBillId(savedBillItemsEntity.getProductEntity().getBill().getId());
        res.setQty(savedBillItemsEntity.getQty());
        res.setMrp(price);
        res.setTax(tax);
        res.setTotal(total);

        return res;
    }
}
