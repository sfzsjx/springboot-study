package com.gree.bdc.aspect.annotation;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OperationType {
    /**
     * 操作类型
     */
    UNKNOWN("unknown"),
    DELETE("delete"),
    UPDATE("update"),
    SELECT("select"),
    INSERT("insert");

    private String value;
}
