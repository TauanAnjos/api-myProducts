package com.myProducts.myProducts.services.Implementations;

import com.myProducts.myProducts.models.ProductModel;
import com.myProducts.myProducts.repositories.ProductRepository;
import com.myProducts.myProducts.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductServiceImplementations implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Override
    public ProductModel saveProduct(ProductModel dataResquestProduct) {
        return productRepository.save(dataResquestProduct);
    }
    @Override
    public List<ProductModel> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<ProductModel> getOneProduct(UUID productId) {
        return productRepository.findById(productId);
    }

    @Override
    public void deletProduct(UUID productId) {
        productRepository.deleteById(productId);
    }

}
