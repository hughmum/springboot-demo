package com.mu.boot.lowcode.model.dto;

import lombok.Data;

import java.util.List;

/**
 * @author Mr.yuan
 * @description 元数据模型通用删除
 **/
@Data
public class UniversalDeleteDTO {

    /**
     * 元数据Id
     */
    private Long metaId;

    /**
     * 记录的Id
     */
    private List idList;

}
