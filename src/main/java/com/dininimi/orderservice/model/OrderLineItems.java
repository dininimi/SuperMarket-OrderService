package com.dininimi.orderservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="order_line_items")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class OrderLineItems {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String skuCode;
    private Double Price;
    private int quantity;

}
