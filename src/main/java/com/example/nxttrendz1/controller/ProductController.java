package com.example.nxttrendz1.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.nxttrendz1.service.ProductJpaService;
import com.example.nxttrendz1.model.Product;

@RestController

public class ProductController {
    @Autowired
    public ProductJpaService productService;

    @GetMapping("/products")
    public ArrayList<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/products/{productId}")
    public Product getProductById(@PathVariable("productId") int productId) {
        return productService.getProductById(productId);
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @PutMapping("/products/{productId}")

    public Product updateProduct(@PathVariable("productId") int productId, @RequestBody Product product) {
        return productService.updateProduct(productId, product);
    }

    @DeleteMapping("/products/{productId}")

    public void deleteProduct(@PathVariable("productId") int productId) {
        productService.deleteProduct(productId);
    }
}