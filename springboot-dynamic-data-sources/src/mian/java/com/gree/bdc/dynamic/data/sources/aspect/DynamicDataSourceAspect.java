package com.gree.bdc.dynamic.data.sources.aspect;

import com.gree.bdc.dynamic.data.sources.annotation.DataSource;
import com.gree.bdc.dynamic.data.sources.config.DataSourceType;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DynamicDataSourceAspect {
    private static final Logger logger =
            LoggerFactory.getLogger(DynamicDataSourceAspect.class);

    @Before("@annotation(dataSource)")//拦截注解
    public void changeDataSources(JoinPoint joinPoint, DataSource dataSource) throws Throwable{
        String value = dataSource.value();
        if (value.equals("primary")){
            DataSourceType.setDataBaseType(DataSourceType.DataBaseType.Primary);
        }else if (value.equals("secondary")){
            DataSourceType.setDataBaseType(DataSourceType.DataBaseType.Secondary);
        }else {
            DataSourceType.setDataBaseType(DataSourceType.DataBaseType.Primary);
        }
    }


    @After("@annotation(dataSource)")
    public void restoreDataSource(JoinPoint joinPoint,DataSource dataSource){
        DataSourceType.clearDataBaseType();
    }
}
