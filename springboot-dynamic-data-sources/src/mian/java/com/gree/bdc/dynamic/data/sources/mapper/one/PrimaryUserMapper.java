package com.gree.bdc.dynamic.data.sources.mapper.one;

import com.gree.bdc.dynamic.data.sources.annotation.DataSource;
import com.gree.bdc.dynamic.data.sources.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface PrimaryUserMapper {

    @DataSource
    List<User> findAll();
}
