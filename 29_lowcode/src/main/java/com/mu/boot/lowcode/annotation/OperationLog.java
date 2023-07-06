package com.mu.boot.lowcode.annotation;

import java.lang.annotation.*;

/**
 * @author Mr.yuan
 * @description 操作日志注解类
 **/
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OperationLog {

    /**模块*/
    String module() default "";

    /**描述*/
    String description() default "";

}
