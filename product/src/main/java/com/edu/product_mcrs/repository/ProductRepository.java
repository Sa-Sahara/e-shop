package com.edu.product_mcrs.repository;

import com.edu.product_mcrs.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
