package com.example.inventoryservice.repository;

import com.example.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/*
@author Marukha
created on 22.05.2024 inside
the package - com.example.inventoryservice.repository
Have a good coding time inside this  class
*/
@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
 Optional<Inventory> findBySkuCode(String skuCode);

 List<Inventory> findBySkuCodeIn(List<String> skuCode);
}
