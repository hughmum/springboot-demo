package com.mu.boot.lowcode.service;

import com.mu.boot.lowcode.model.dto.UniversalDeleteDTO;
import com.mu.boot.lowcode.model.dto.UniversalSaveDTO;
import com.mu.boot.lowcode.model.tool.JsonResult;
import com.mu.boot.lowcode.model.dto.UniversalQueryParamDTO;

/**
 * @author Mr.yuan
 * @description 通用元数据模型对应表的CRUD操作
 **/
public interface UniversalService {

    /**
     * 通用查询
     */
    JsonResult query(UniversalQueryParamDTO universalQueryParam);

    /**
     * 通用新增和修改
     */
    JsonResult save(UniversalSaveDTO universalSaveDTO);

    /**
     * 通用删除
     */
    JsonResult delete(UniversalDeleteDTO universalDeleteDTO);

}
