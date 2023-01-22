package org.ikechukwu.productservice.repository;

import org.ikechukwu.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}


