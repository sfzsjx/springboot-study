package com.gree.bdc.aspect.service;

public interface UserService {
    /**
     * 获取用户信息
     * @return 用户信息
     * @param tel 电话
     */
    String findUserName(String tel);
}
