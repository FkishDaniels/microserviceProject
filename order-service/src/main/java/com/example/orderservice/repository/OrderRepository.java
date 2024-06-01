package com.example.orderservice.repository;

import com.example.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
@author Marukha
created on 22.05.2024 inside
the package - com.example.orderservice.repository
Have a good coding time inside this  class
*/
@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
}
