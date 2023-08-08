package com.edu.eshop.service;

import com.edu.eshop.dto.ProductRequest;
import com.edu.eshop.dto.ProductResponse;
import com.edu.eshop.model.Product;
import com.edu.eshop.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository repository;

    public void createProduct(ProductRequest request){
        Product product = Product.builder()
                .name(request.getName())
                .description(request.getDescription())
                .price(request.getPrice())
                .build();

        repository.save(product);
    }

    public List<ProductResponse> getAllProducts() {
        List<Product> products = repository.findAll();

        return products.stream()
                .map(this::mapToProductResponse)
                .toList();
    }

    private ProductResponse mapToProductResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }
}
