package org.ikechukwu.inventoryservice;

import org.ikechukwu.inventoryservice.model.Inventory;
import org.ikechukwu.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class InventoryServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
        return args -> {
            Inventory inventory = new Inventory();
            inventory.setSkuCode("iphone_13");
            inventory.setQuantity(100);

            Inventory inventory1 = new Inventory();
            inventory1.setSkuCode("iphone_13-red");
            inventory1.setQuantity(0);

//            Inventory inventory2 = new Inventory();
//            inventory2.setSkuCode("27-inches Monitor");
//            inventory2.setQuantity(20);

            inventoryRepository.save(inventory);
            inventoryRepository.save(inventory1);
//            inventoryRepository.save(inventory2);
        };
    }
}


