package com.mu.boot.springdatajpa.repository;


import com.mu.boot.springdatajpa.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Integer> {
}
