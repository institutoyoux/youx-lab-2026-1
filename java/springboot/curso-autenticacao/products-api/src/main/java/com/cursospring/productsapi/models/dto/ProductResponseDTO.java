package com.cursospring.productsapi.models.dto;

import com.cursospring.productsapi.models.Product;

import java.util.UUID;

public record ProductResponseDTO(UUID id, String name, Double price) {
    public ProductResponseDTO(Product product){
        this(product.getId(), product.getName(), product.getPrice());
    }
}