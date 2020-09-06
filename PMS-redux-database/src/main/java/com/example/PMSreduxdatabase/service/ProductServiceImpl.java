package com.example.PMSreduxdatabase.service;

import com.example.PMSreduxdatabase.model.Product;
import com.example.PMSreduxdatabase.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepository productRepository;


    @Override
    public Iterable<Product> listProducts() {
        return productRepository.findAll();
//        return null;

    }
}
