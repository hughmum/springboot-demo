package com.mu.boot.lowcode.repository;

import com.mu.boot.lowcode.model.MetaColumn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

/**
 /**
 * @author Mr.yuan
 * @description 元数据模型字段持久化仓库
 **/
public interface MetaColumnRepository extends JpaRepository<MetaColumn,Integer> {

    @Transactional
    @Modifying
    void deleteAllByMetaIdIn(java.util.List<Long> metaIdList);

}
