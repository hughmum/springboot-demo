package com.mu.boot.databaselook.repository;

import com.mu.boot.databaselook.model.Commodity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommodityRepository extends JpaRepository<Commodity, Integer> {

    Commodity findByCommodityName(String name);
}
