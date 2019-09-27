package com.gree.bdc.dynamic.data.sources.mapper.two;

import com.gree.bdc.dynamic.data.sources.annotation.DataSource;
import com.gree.bdc.dynamic.data.sources.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface SecondaryUserMapper {
    @DataSource("secondary")
    List<User> findAll();
}
