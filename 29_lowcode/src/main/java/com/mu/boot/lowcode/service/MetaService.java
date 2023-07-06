package com.mu.boot.lowcode.service;

import com.mu.boot.lowcode.model.MetaInfo;
import com.mu.boot.lowcode.model.tool.JsonResult;

/**
 * @author Mr.yuan
 * @description 元数据服务
 **/
public interface MetaService extends BaseService<MetaInfo,Long> {

    /**
     * 获取数据类型
     */
    JsonResult getDataTypeList();

}
