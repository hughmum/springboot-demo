package com.mu.boot.lowcode.model.dto;

import com.mu.boot.lowcode.model.vo.MetaColumnVO;
import lombok.Data;

import java.util.List;

/**
 * @author Mr.yuan
 * @description 通用保存字段模型
 **/
@Data
public class UniversalSaveDTO {

    /**
     * 保存元数据
     */
    private Long metaId;

    /**
     * 字段内容
     */
    private List<MetaColumnVO> data;

}
