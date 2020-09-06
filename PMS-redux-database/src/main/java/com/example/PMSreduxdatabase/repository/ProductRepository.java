package com.example.PMSreduxdatabase.repository;

import com.example.PMSreduxdatabase.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
