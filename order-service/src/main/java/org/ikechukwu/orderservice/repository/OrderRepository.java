package org.ikechukwu.orderservice.repository;

import org.ikechukwu.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
