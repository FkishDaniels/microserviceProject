package com.example.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/*
@author Marukha
created on 22.05.2024 inside
the package - com.example.orderservice.dto
Have a good coding time inside this  class
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItemsDto {
 private Long id;
 private String skuCode;
 private BigDecimal price;
 private Integer quantity;
}
