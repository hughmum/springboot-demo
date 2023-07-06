package com.mu.boot.lowcode.controller;

import com.alibaba.fastjson.JSONObject;
import com.mu.boot.lowcode.annotation.OperationLog;
import com.mu.boot.lowcode.model.MetaInfo;
import com.mu.boot.lowcode.model.tool.JsonResult;
import com.mu.boot.lowcode.model.tool.PageParam;
import com.mu.boot.lowcode.service.MetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Mr.yuan
 * @description 元数据管理
 **/
@RestController
@RequestMapping("/meta")
public class MetaController {

    @Autowired
    private MetaService metaService;

    /**
     * 分页查询的元数据列表
     */
    @PostMapping("/queryByCondition")
    public JsonResult findAll(@RequestBody PageParam<MetaInfo> pageParam) {
        return metaService.queryByCondition(pageParam);
    }

    @OperationLog(module = "元数据管理",description = "添加或修改")
    @PostMapping("/")
    public JsonResult save(@RequestBody @javax.validation.Valid MetaInfo metaInfo) {
        return metaService.save(metaInfo);
    }

    @OperationLog(module = "元数据管理",description = "删除")
    @PostMapping("/delete")
    public JsonResult delete(@RequestBody String idList) {
        return metaService.deleteByIdList(JSONObject.parseArray(idList,Long.class));
    }

    /**
     * 获取数据库字段类型
     */
    @GetMapping("/getDataTypeList")
    public JsonResult getDataTypeList(){
        return metaService.getDataTypeList();
    }

}
