package com.example.springboot.services;

import com.example.springboot.models.ProductModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductsServices {
    List<ProductModel> findAll();
    Optional<ProductModel> findById(UUID id);
    ProductModel save(ProductModel productModel);
    void delete(ProductModel productModel);
}
