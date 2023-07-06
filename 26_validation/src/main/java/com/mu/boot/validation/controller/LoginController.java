package com.mu.boot.validation.controller;

import com.mu.boot.validation.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @Description
 * @Author Mr.yuan
 * @CreateTime 2022/5/10 12:30
 **/
@RestController
public class LoginController {

    @RequestMapping("/login")
    public String test(@RequestBody User user){
        if(user.getUserName()!=null && user.getPassword()!=null){
             //查数据库验证逻辑省略
            System.out.println(user);
            return "登录成功";
        }else{
            return "参数不能为null";
        }
    }

    @RequestMapping("/save")
    public String save(@Valid @RequestBody User user){
        System.out.println(user);
        return "登录成功";
    }
}
