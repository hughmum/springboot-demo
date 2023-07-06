package com.mu.boot.lowcode.service.system;


import com.mu.boot.lowcode.model.system.SysMenu;
import com.mu.boot.lowcode.model.system.SysRole;
import com.mu.boot.lowcode.model.tool.JsonResult;
import com.mu.boot.lowcode.model.vo.SelectVO;
import com.mu.boot.lowcode.service.BaseService;

import java.util.List;

public interface SysRoleService extends BaseService<SysRole, Integer> {

    List<SysMenu> getMenuListByRole(SysRole sysRole);

    JsonResult<List<SelectVO>> findSelectList();

    JsonResult getMenuListByToken(String token);
}
