package com.example.PMSreduxdatabase.controller;

import com.example.PMSreduxdatabase.model.Product;

import com.example.PMSreduxdatabase.repository.ProductRepository;
import com.example.PMSreduxdatabase.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public Iterable<Product> listProducts() {
        return productService.listProducts();

    }
}
