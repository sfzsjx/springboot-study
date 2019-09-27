package com.gree.bdc.dynamic.data.sources.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
    private Integer user_id;
    private String user_name;
    private Integer user_age;
}
