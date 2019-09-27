package com.gree.bdc.dynamic.data.sources.controller;

import com.gree.bdc.dynamic.data.sources.entity.User;
import com.gree.bdc.dynamic.data.sources.mapper.one.PrimaryUserMapper;
import com.gree.bdc.dynamic.data.sources.mapper.two.SecondaryUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private PrimaryUserMapper primaryUserMapper;
    @Autowired
    private SecondaryUserMapper secondaryUserMapper;

    @RequestMapping("primary")
    public Object primary(){
        List<User> list = primaryUserMapper.findAll();
        return list;
    }
    @RequestMapping("secondary")
    public Object secondary  (){
        List<User> list = secondaryUserMapper.findAll();
        return list;
    }
}
