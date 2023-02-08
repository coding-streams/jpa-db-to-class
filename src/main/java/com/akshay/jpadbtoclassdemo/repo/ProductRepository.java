package com.akshay.jpadbtoclassdemo.repo;

import com.akshay.jpadbtoclassdemo.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
