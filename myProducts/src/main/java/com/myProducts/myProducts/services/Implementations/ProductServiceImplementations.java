package com.myProducts.myProducts.services.Implementations;

import com.myProducts.myProducts.models.ProductModel;
import com.myProducts.myProducts.repositories.ProductRepository;
import com.myProducts.myProducts.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImplementations implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Override
    public List<ProductModel> getAllProducts() {
        return productRepository.findAll();
    }
}
