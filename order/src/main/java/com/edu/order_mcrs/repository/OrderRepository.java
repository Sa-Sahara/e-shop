package com.edu.order_mcrs.repository;

import com.edu.order_mcrs.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
