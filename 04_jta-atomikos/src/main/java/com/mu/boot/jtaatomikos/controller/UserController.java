package com.mu.boot.jtaatomikos.controller;

import com.mu.boot.jtaatomikos.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    OrderService orderService;

    /**
     * test
     * 0 则添加
     * 1 则模拟抛异常回滚事务
     */
    @GetMapping("/user")
    public String add(){
         return orderService.insertDbaAndDbB(true);
    }

}
