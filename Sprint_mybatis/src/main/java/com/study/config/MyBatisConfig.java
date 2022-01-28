package com.study.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @Program: MyJavaStudy
 * @ClassName: MyBatisConfig
 * @Author: David_J
 * @Copyright David
 * @Date: 2022-03-11 14:47
 * @Version: V1.0
 */
public class MyBatisConfig {
    @Bean
    public SqlSessionFactoryBean getSql(@Autowired DataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setTypeAliasesPackage("com.study.domain");
        sqlSessionFactory.setDataSource(dataSource);
        return sqlSessionFactory;
    }

    @Bean
    public MapperScannerConfigurer getMapper(){
        MapperScannerConfigurer ms = new MapperScannerConfigurer();
        ms.setBasePackage("com.study.dao");
        return ms;
    }
}
