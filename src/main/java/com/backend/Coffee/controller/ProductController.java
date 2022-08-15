package com.backend.Coffee.controller;

import com.backend.Coffee.model.Product;
import com.backend.Coffee.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/all")
    public List<Product> getAllProduct() {
        return productService.getAllProduct();
    }

    @PostMapping("/add")
    public Product createNewGateway(@RequestBody Product product) {
        return productService.createNewProduct(product);
    }

}
