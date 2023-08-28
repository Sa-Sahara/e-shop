package org.example;

import org.example.model.Inventory;
import org.example.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryMcrsApp {
    public static void main(String[] args) {
        SpringApplication.run(InventoryMcrsApp.class, args);
    }

    @Bean
    CommandLineRunner loadData(InventoryRepository repository){
        return args -> {
            Inventory inventory0 = new Inventory();
            inventory0.setSkuCode("iphone_14");
            inventory0.setQuantity(100);

            Inventory inventory1 = new Inventory();
            inventory1.setSkuCode("iphone_14_red");
            inventory1.setQuantity(0);

            repository.save(inventory0);
            repository.save(inventory1);
        };
    }
}
