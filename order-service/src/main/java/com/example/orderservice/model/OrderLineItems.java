package com.example.orderservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/*
@author Marukha
created on 22.05.2024 inside
the package - com.example.orderservice.model
Have a good coding time inside this  class
*/
@Entity
@Getter
@Setter
@Table(name = "order_line_items")
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItems {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String skuCode;
   private BigDecimal price;
   private Integer quantity;
   @ManyToOne
   private Order order;
}
