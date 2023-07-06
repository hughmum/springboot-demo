package com.mu.boot.lowcode.service.system;


import com.mu.boot.lowcode.model.dto.UpdatePasswordDTO;
import com.mu.boot.lowcode.model.system.SysUser;
import com.mu.boot.lowcode.model.tool.JsonResult;
import com.mu.boot.lowcode.repository.system.BaseCustomRepository;
import com.mu.boot.lowcode.service.BaseService;


public interface SysUserService extends BaseService<SysUser,Integer>, BaseCustomRepository<SysUser> {

    /**
     * 登录认证
     */
    JsonResult login(String data, String clientIp);


    /**
     * 启用或者禁用用户
     */
    JsonResult userEnabled(String data);

    /**
     * 修改密码
     */
    JsonResult updatePassword(UpdatePasswordDTO updatePasswordDTO);



    JsonResult restPassword(Integer id);

}
