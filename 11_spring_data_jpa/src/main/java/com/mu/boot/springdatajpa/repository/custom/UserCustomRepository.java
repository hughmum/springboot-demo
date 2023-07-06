package com.mu.boot.springdatajpa.repository.custom;


import com.mu.boot.springdatajpa.model.User;

import java.util.List;

public interface UserCustomRepository {
    List<Object[]> findBynativeQuery(User user);
}
