package com.mu.boot.springdatajpa.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Mr.yuan
 * @CreateTime 2020/5/23 23:35
 * @description
 **/
@Entity
@Table(name = "sys_role")
@Data
public class Role  extends BaseModel{

    private String roleName;

    private String roleCode;


}
