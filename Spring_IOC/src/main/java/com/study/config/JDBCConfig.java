package com.study.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


/**
 * @Program: MyJavaStudy
 * @ClassName: JDBCConfig
 * @Author: David_J
 * @Copyright David
 * @Date: 2022-03-08 16:06
 * @Version: V1.0
 */
//@Component 注释掉，调整为核心配置文件中添加@Import
public class JDBCConfig {
    @Bean("dataSource")
    public DruidDataSource getDataSource(){
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUsername("root");
        ds.setPassword("123456");
        ds.setUrl("jdbc:mysql://localhost/3306/spring_db");
        return ds;
    }

//    @Bean(???)
//    public static ??? get???(){
//        ...
//        ...
//        return ???
//    }
}
