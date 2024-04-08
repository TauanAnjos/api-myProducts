package com.myProducts.myProducts.services;

import com.myProducts.myProducts.models.ProductModel;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {

    List<ProductModel> getAllProducts();
}
