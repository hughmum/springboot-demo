package com.mu.boot.druid.druidmonitor.repository;


import com.mu.boot.druid.druidmonitor.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders,String> {
}
