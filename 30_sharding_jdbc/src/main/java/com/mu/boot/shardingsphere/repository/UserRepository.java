package com.mu.boot.shardingsphere.repository;

import com.mu.boot.shardingsphere.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
