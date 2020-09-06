package com.example.PMSreduxdatabase.service;

import com.example.PMSreduxdatabase.model.Product;
import com.example.PMSreduxdatabase.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;


    @Override
    public Iterable<Product> listProducts() {
        return productRepository.findAll();
//        return null;

    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
