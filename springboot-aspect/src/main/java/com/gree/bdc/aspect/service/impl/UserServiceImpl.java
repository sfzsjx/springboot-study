package com.gree.bdc.aspect.service.impl;

import com.gree.bdc.aspect.annotation.OperationLogDetail;
import com.gree.bdc.aspect.annotation.OperationType;
import com.gree.bdc.aspect.annotation.OperationUnit;
import com.gree.bdc.aspect.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @OperationLogDetail(detail = "通过手机号[{{tel}}]获取用户名",level = 3,operationUnit = OperationUnit.USER,operationType = OperationType.SELECT)
    @Override
    public String findUserName(String tel) {
        System.out.println("tel:" + tel);
        return "zhangsan";
    }
}
