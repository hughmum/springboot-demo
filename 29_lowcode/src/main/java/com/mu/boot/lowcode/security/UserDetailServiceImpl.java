package com.mu.boot.lowcode.security;

import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

/**
 * @author Mr.yuan
 * @description 空实现
 **/
@Service
public class UserDetailServiceImpl implements org.springframework.security.core.userdetails.UserDetailsService {


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       return null;
    }
}
