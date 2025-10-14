package com.br.microservices.orchestrated.payment_service.core.dto;

import com.br.microservices.orchestrated.orchestrator_service.core.dto.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderProducts {
    private Product product;
    private int quantity;

}
