package com.akshay.jpadbtoclassdemo.service;

import com.akshay.jpadbtoclassdemo.model.Product;
import com.akshay.jpadbtoclassdemo.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        productRepository.findAll().forEach(products::add);

        return products;
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }
}
