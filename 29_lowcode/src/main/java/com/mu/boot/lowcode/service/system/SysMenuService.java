package com.mu.boot.lowcode.service.system;

import com.mu.boot.lowcode.model.system.SysMenu;
import com.mu.boot.lowcode.model.tool.JsonResult;
import com.mu.boot.lowcode.service.BaseService;

/**
 * @author MCQ
 * @Description
 * @date 2021-04-15 14:53
 */
public interface SysMenuService extends BaseService<SysMenu, Integer> {

    JsonResult findAll();

    JsonResult reloadMenu(java.util.List<SysMenu> sysMenus, String token);

}
