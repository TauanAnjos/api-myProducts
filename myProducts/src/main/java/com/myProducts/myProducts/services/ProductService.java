package com.myProducts.myProducts.services;

import com.myProducts.myProducts.models.ProductModel;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductService {

    ProductModel saveProduct(ProductModel dataResquestProduct);
    List<ProductModel> getAllProducts();

    Optional<ProductModel> getOneProduct(UUID productId);
}
