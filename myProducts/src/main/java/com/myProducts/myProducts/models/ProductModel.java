package com.myProducts.myProducts.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.myProducts.myProducts.enums.ProductType;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "tb_products")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID productId;
    @Column(nullable = false, length = 50, unique = true)
    private String name;
    @Column(length = 255)
    private String description;
    @Enumerated(EnumType.STRING)
    private ProductType productType;
    @Column(nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    private LocalDateTime creationDate;
    @Column(nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    private LocalDateTime lastUpdateDate;

    @PrePersist
    protected void onCreate(){
        this.creationDate = LocalDateTime.now();
        this.lastUpdateDate = LocalDateTime.now();
    }
    @PreUpdate
    protected void onUpdate(){
        this.lastUpdateDate = LocalDateTime.now();
    }

}
