package com.example.notificationservice.event;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class OrderPlacedEvent {
    private String orderNumber;
}
