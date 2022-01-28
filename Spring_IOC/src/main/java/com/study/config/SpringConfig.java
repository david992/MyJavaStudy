package com.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.Order;

/**
 * @Program: MyJavaStudy
 * @ClassName: SpringConfig
 * @Author: David_J
 * @Copyright David
 * @Date: 2022-03-11 11:05
 * @Version: V1.0
 */

@Configuration
@ComponentScan("com.study")
@Import(JDBCConfig.class)
@Order(2)

public class SpringConfig {
    @Bean("ccc")
    public String getC1() {
        System.out.println(" cccc1");
        return "";
    }
}
