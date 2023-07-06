package com.mu.boot.springdatajpa.repository;

import com.mu.boot.springdatajpa.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRoleRepository extends JpaRepository<UserRole,UserRole.PK> {


}
