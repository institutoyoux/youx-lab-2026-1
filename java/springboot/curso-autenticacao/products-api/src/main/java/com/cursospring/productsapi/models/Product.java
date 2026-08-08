package com.cursospring.productsapi.models;

import com.cursospring.productsapi.models.dto.ProductResponseDto;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "product")
@Data
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private Double price;

    public Product(ProductResponseDto dto) {
        this.name = dto.name();
        this.price = dto.price();
    }

}
