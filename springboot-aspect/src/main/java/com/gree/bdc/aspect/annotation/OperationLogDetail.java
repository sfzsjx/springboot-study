package com.gree.bdc.aspect.annotation;

import java.lang.annotation.*;

/**
 * 自定义注解操作日志
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OperationLogDetail {

    /**
     * 方法描述，可使用占位符获取参数：{{tel}}
     */
    String detail() default "";

    /**
     * 日志等级：1-9
     */
    int level() default 0;

    /**
     * 操作类型（enum）:主要是 select,insert,update,delete
     */
    OperationType operationType() default OperationType.UNKNOWN;

    /**
     * 被操作的对象（enum）:可以是任何对象，如表名，或工具（redis）
     */

    OperationUnit operationUnit() default OperationUnit.UNKNOWN;


}
