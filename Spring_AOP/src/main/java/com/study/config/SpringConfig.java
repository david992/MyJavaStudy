package com.study.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Program: MyJavaStudy
 * @ClassName: SpringConfig
 * @Author: David_J
 * @Copyright David
 * @Date: 2022-03-31 11:01
 * @Version: V1.0
 */

@Configuration
@ComponentScan("com.study")
@EnableAspectJAutoProxy
//@EnableAspectJAutoProxy(proxyTargetClass = false)
public class SpringConfig {

}
