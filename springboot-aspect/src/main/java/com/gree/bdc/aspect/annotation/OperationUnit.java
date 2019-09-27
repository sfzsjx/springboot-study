package com.gree.bdc.aspect.annotation;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 被操作的单元
 */
@Getter
@AllArgsConstructor
public enum  OperationUnit {
    /**
     * 被操作的单元
     */
    UNKNOWN("unknown"),
    USER("user"),
    EMPLOYEE("employee"),
    Redis("redis");
    private String value;

}
