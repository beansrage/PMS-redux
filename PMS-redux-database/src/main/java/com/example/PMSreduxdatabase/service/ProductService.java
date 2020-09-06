package com.example.PMSreduxdatabase.service;

import com.example.PMSreduxdatabase.model.Product;

public interface ProductService {
    Iterable<Product> listProducts();
    public Product createProduct(Product product);

}
