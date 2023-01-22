package org.ikechukwu.inventoryservice.service;

import lombok.RequiredArgsConstructor;
import org.ikechukwu.inventoryservice.repository.InventoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@javax.transaction.Transactional
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    public boolean isInStock(String skuCode) {
        return inventoryRepository.findBySkuCode().isPresent();
    }
}
