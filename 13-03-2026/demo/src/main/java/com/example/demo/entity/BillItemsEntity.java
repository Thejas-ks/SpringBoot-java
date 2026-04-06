package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="billItem")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BillItemsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinColumn(name="bill_id")
    private BillsEntity billsEntity;

    @ManyToMany
    @JoinColumn(name="prod_id")
    private ProductEntity productEntity;
    private Integer qty;

}
