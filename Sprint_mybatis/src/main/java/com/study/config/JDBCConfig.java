package com.study.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @Program: MyJavaStudy
 * @ClassName: JDBCConfig
 * @Author: David_J
 * @Copyright David
 * @Date: 2022-03-11 14:45
 * @Version: V1.0
 */

public class JDBCConfig {

    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String userName;
    @Value("${jdbc.password}")
    private String passWord;

    @Bean("dataSource")
     public DruidDataSource getDataSource(){
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUsername(userName);
        ds.setPassword(passWord);
        ds.setUrl(url);
        return ds;
    }

    @Bean("jdbcTemplate")
    public JdbcTemplate getJdbcTemplete (@Autowired DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }


}
