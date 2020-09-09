package com.example.PMSreduxdatabase.controller;

import com.example.PMSreduxdatabase.model.Product;

import com.example.PMSreduxdatabase.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public Iterable<Product> listProducts() {
        return productService.listProducts();

    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
//        System.out.println(product);
        return productService.createProduct(product);
    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteProduct(@PathVariable Long id) {
//        System.out.println(id);
        return productService.deleteProduct(id);
    }
//
}
