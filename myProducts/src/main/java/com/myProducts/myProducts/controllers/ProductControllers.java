package com.myProducts.myProducts.controllers;

import com.myProducts.myProducts.models.ProductModel;
import com.myProducts.myProducts.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductControllers {
    @Autowired
    ProductService productService;
    @GetMapping
    public List<ProductModel> getAllProducts(){
        return productService.getAllProducts();
    }
}
