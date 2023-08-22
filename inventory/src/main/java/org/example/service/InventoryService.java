package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.model.Inventory;
import org.example.repository.InventoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InventoryService {
    private final InventoryRepository repository;

    @Transactional(readOnly = true)
    public boolean isInStock(String skuCode){
        return repository.findByScuCode(skuCode).isPresent();
    }
}
