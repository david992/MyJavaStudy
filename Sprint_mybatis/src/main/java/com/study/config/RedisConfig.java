package com.study.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * @Program: MyJavaStudy
 * @ClassName: RedisConfig
 * @Author: David_J
 * @Copyright David
 * @Date: 2022-05-12 16:57
 * @Version: V1.0
 */
//@PropertySource("redis.properties")
public class RedisConfig {

    @Value("${redis.host}")
    private String host;

    @Value("${redis.port}")
    private Integer port;

    @Value("${redis.maxActive}")
    private Integer maxActive;

    @Value("${redis.maxIdle}")
    private Integer maxIdle;

    @Value("${redis.minIdle}")
    private Integer minIdle;

    @Value("${redis.maxWait}")
    private Integer maxWait;



}
