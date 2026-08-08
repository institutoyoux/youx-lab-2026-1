package com.cursospring.productsapi.controllers;

import com.cursospring.productsapi.models.Product;
import com.cursospring.productsapi.models.dto.ProductResponseDTO;
import com.cursospring.productsapi.models.dto.ProductResponseDto;
import com.cursospring.productsapi.repositories.ProductRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductRepository repository;
    @PostMapping
    public ResponseEntity postProduct(@RequestBody @Valid ProductResponseDto dto){
        Product newProduct = repository.save(new Product(dto));
        return ResponseEntity.ok(newProduct);
    }

    @GetMapping
    public ResponseEntity getProducts(){
        List<ProductResponseDTO> products = repository.findAll().stream().map(ProductResponseDTO::new).toList();
        return ResponseEntity.ok(products);
    }
}
