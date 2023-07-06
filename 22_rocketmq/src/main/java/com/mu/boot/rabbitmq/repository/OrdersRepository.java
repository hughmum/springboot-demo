package com.mu.boot.rabbitmq.repository;


import com.mu.boot.rabbitmq.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders,Long> {
}
