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
@Order(1)
public class SpringConfig2 {
    @Bean("ccc2")
    public String getC2() {
        System.out.println(" cccc2");
        return "";
    }
}
