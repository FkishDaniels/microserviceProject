package com.example.productservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/*
@author Marukha
created on 22.05.2024 inside
the package - com.example.productservice.dto
Have a good coding time inside this  class
*/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
  private String id;
  private String name;
  private String description;
  private BigDecimal price;
}
