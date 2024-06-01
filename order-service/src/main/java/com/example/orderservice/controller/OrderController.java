package com.example.orderservice.controller;

/*
@author Marukha
created on 22.05.2024 inside
the package - com.example.orderservice.controller
Have a good coding time inside this  class
*/

import com.example.orderservice.dto.OrderRequest;
import com.example.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/order")
public class OrderController{
 private final OrderService orderService;
   @PostMapping
   @ResponseStatus(HttpStatus.CREATED)
   public String placeOrder(@RequestBody OrderRequest orderRequest){
       orderService.placeOrder(orderRequest);
       return "Order Places Successfully";
   }

}