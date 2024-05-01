package com.example.Phase3_Practiceproject4.entity;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/products/{id}")
    public String getProduct(@PathVariable Long id) {
        // Assuming this is where you would fetch the product from a repository
        // For demonstration purposes, let's assume the product is not found
        throw new ProductNotFoundException("Product not found with id: " + id);
    }
}
