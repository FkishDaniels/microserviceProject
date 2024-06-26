package com.example.orderservice.controller;

/*
@author Marukha
created on 22.05.2024 inside
the package - com.example.orderservice.controller
Have a good coding time inside this  class
*/

import com.example.orderservice.dto.OrderRequest;
import com.example.orderservice.dto.OrderResponse;
import com.example.orderservice.service.OrderService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import io.github.resilience4j.timelimiter.annotation.TimeLimiter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/order")
public class OrderController{
 private final OrderService orderService;
   @PostMapping
   @ResponseStatus(HttpStatus.CREATED)
   @CircuitBreaker(name = "inventory",fallbackMethod = "fallbackMethod")
   @TimeLimiter(name= "inventory")
   @Retry(name = "inventory")
   public CompletableFuture<String> placeOrder(@RequestBody OrderRequest orderRequest){
       return CompletableFuture.supplyAsync(() ->orderService.placeOrder(orderRequest));
   }

   @GetMapping
   @ResponseStatus(HttpStatus.OK)
   public List<OrderResponse> getAllOrders(){
       return orderService.getAllOrders();
   }

   public CompletableFuture<String> fallbackMethod(OrderRequest orderRequest, RuntimeException runtimeException) {
       return CompletableFuture.supplyAsync(() -> "Oops! Something went wrong, please place order after some time!");
   }
}