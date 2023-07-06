package com.mu.boot.lowcode.model.dto;

import lombok.Data;

/**
 * @author Mr.yuan
 * @description 修改密码
 **/
@Data
public class UpdatePasswordDTO {
    /**
     * 用户Id
     */
    private Integer userId;
    /**
     * 原密码
     */
    private String oldPassword;
    /**
     * 新密码
     */
    private String password;

}
