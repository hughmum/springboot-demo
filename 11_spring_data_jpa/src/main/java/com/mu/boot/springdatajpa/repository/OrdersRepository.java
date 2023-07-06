package com.mu.boot.springdatajpa.repository;


import com.mu.boot.springdatajpa.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders,String> {
}
