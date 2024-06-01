package com.example.inventoryservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
@author Marukha
created on 22.05.2024 inside
the package - com.example.inventoryservice.model
Have a good coding time inside this  class
*/
@Entity
@Table(name ="inventory")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "skucode")
  private String skuCode;
  @Column(name ="quantity")
  private Integer quantity;

}
