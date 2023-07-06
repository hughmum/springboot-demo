package com.mu.boot.dobbo.consumer.service;

import com.mu.boot.dobbo.pojo.User;

/**
 * @Description   服务消费者接口
 */
public interface OrderService {
    User InitOrder(Integer userId);
}
