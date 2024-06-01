package com.example.productservice.repository;

import com.example.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
@author Marukha
created on 22.05.2024 inside
the package - com.example.productservice.repository
Have a good coding time inside this  class
*/
public interface ProductRepository extends JpaRepository<Product,String> {
}
