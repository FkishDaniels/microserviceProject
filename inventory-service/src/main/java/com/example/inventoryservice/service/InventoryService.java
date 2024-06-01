package com.example.inventoryservice.service;

import com.example.inventoryservice.dto.InventoryResponse;
import com.example.inventoryservice.model.Inventory;
import com.example.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static java.util.stream.Collectors.toList;

/*
@author Marukha
created on 22.05.2024 inside
the package - com.example.inventoryservice.service
Have a good coding time inside this  class
*/
@Service
@RequiredArgsConstructor
public class InventoryService {
 private final InventoryRepository inventoryRepository;
 @Transactional(readOnly = true)
 public List<InventoryResponse> isInStock(List<String> skuCode){
   return inventoryRepository.findBySkuCodeIn(skuCode).stream()
           .map(inventory ->
               InventoryResponse.builder()
                       .skuCode(inventory.getSkuCode())
                       .isInStock(inventory.getQuantity() >0)
                       .build()
           ).toList();
 }
}
