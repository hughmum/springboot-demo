package com.mu.boot.lowcode.repository.system;

import com.mu.boot.lowcode.model.tool.PageParam;
import org.springframework.data.domain.Page;

/**
 * @author Mr.yuan
 * @description 基础自定义接口
 **/
public interface BaseCustomRepository<T> {

    /**
     * 自定义查询
     * @param pageParam
     * @return
     */
    Page<T> findAllByCondition(PageParam<T> pageParam);

}
