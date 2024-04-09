package com.myProducts.myProducts.controllers;

import com.myProducts.myProducts.models.ProductModel;
import com.myProducts.myProducts.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("products")
public class ProductControllers {
    @Autowired
    ProductService productService;
    @PostMapping
    public ResponseEntity<ProductModel>saveProduct(@RequestBody ProductModel dataResquestProduct){
        ProductModel saveProduct = productService.saveProduct(dataResquestProduct);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveProduct);
    }
    @GetMapping
    public List<ProductModel> getAllProducts(){
        return productService.getAllProducts();
    }
    @GetMapping("/{productId}")
    public ResponseEntity<Object>getOneProduct(@PathVariable(value = "productId")UUID productId){
        Optional<ProductModel> product = productService.getOneProduct(productId);
        if (product.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(product);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found");
        }

    }

}
