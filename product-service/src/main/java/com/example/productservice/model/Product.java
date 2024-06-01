package com.example.productservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;

/*
@author Marukha
created on 22.05.2024 inside
the package - com.example.productservice
Have a good coding time inside this  class
*/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "product")
public class Product {

    @Id
    @Column(name ="id")
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String id;
    @Column(name ="name")
    private String name;
    @Column(name="description")
    private String description;
    @Column(name="price")
    private BigDecimal price;
}
