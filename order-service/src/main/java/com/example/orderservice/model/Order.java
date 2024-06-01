package com.example.orderservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/*
@author Marukha
created on 22.05.2024 inside
the package - com.example.orderservice.model
Have a good coding time inside this  class
*/
@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)

   private Long id;

   private String orderNumber;

   @OneToMany(cascade = CascadeType.ALL)
   private List<OrderLineItems> orderLineItemsList;


}
