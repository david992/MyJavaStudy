package com.study.config;

import org.springframework.context.annotation.*;

/**
 * @Program: MyJavaStudy
 * @ClassName: SpringConfig
 * @Author: David_J
 * @Copyright David
 * @Date: 2022-03-11 14:46
 * @Version: V1.0
 */

@Configuration //表示该核心配置类代替xml配置文件
@ComponentScan("com.study")//开启扫描
@PropertySource({"classpath:jdbc.properties",})
//@PropertySource({"classpath:jdbc.properties","classpath:redis.properties"})
//@PropertySources({  @PropertySource("classpath:jdbc.properties"),
//                    @PropertySource("classpath:redis.properties")})
@Import({JDBCConfig.class,MyBatisConfig.class})
public class SpringConfig {
}
