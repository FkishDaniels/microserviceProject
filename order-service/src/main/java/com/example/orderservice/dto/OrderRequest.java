package com.example.orderservice.dto;

import com.example.orderservice.model.Order;
import com.example.orderservice.model.OrderLineItems;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/*
@author Marukha
created on 22.05.2024 inside
the package - com.example.orderservice.dto
Have a good coding time inside this  class
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
 private List<OrderLineItemsDto> orderLineItemsDtoList;

}
