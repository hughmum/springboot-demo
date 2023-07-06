package com.mu.boot.dobbo.provider;

import com.mu.boot.dobbo.pojo.User;


/**
 * @Description   服务提供者接口
 **/
public interface UserService {

    User getUserInfo(Integer userId);
}
