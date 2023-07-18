package com.dininimi.orderservice.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItemsDto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String skuCode;
    private Double Price;
    private int quantity;

}
