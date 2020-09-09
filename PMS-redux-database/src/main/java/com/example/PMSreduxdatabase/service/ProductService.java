package com.example.PMSreduxdatabase.service;

import com.example.PMSreduxdatabase.model.Product;
import org.springframework.http.HttpStatus;

public interface ProductService {
    Iterable<Product> listProducts();
    public Product createProduct(Product product);
    HttpStatus deleteProduct(Long id);
}
