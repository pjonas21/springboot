package com.example.springboot.services.implementation;

import com.example.springboot.models.ProductModel;
import com.example.springboot.repositories.ProductRepository;
import com.example.springboot.services.ProductsServices;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductsImplementation implements ProductsServices {
    private final ProductRepository productRepository;
    ProductsImplementation (ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Override
    public List<ProductModel> findAll() { return productRepository.findAll(); }

    @Override
    public Optional<ProductModel> findById(UUID id) { return productRepository.findById(id); }

    @Override
    public ProductModel save(ProductModel productModel) { return productRepository.save(productModel); }

    @Override
    public void delete(ProductModel productModel) { productRepository.delete(productModel);}
}
