package com.study.config;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @Program: MyJavaStudy
 * @ClassName: RedisConfig
 * @Author: David_J
 * @Copyright David
 * @Date: 2022-05-12 16:57
 * @Version: V1.0
 */
@PropertySource("redis.properties")
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


    @Bean()
    //配置redisTemplate
    public RedisTemplate createRedisTemplate(RedisConnectionFactory redisConnectionFactory){
        //1、创建对象
        RedisTemplate redisTemplate = new StringRedisTemplate();
        //2、设置连接工厂
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        //3、设置redis生成的key的序列化器 对key编码处理
        RedisSerializer serializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(serializer);
        redisTemplate.setHashKeySerializer(serializer);
        return redisTemplate;
    }

    @Bean
    //配置redis连接工厂
    public RedisConnectionFactory createRedisConnectionFactory(RedisStandaloneConfiguration redisStandaloneConfiguration,GenericObjectPoolConfig genericObjectPoolConfig  ){
        //1.创建配置构建器，（基于池的思想管理jedis连接）
        JedisClientConfiguration.JedisPoolingClientConfigurationBuilder build = ( JedisClientConfiguration.JedisPoolingClientConfigurationBuilder) JedisClientConfiguration.builder();
        //2.设置吃的配置信息对象
        build.poolConfig(genericObjectPoolConfig);
        //3.创建jedis连接工厂
        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory(redisStandaloneConfiguration,build.build());
        //4.返回对象
        return jedisConnectionFactory;

    }

    @Bean
    public GenericObjectPoolConfig creatGenericObjectPoolConfig(){
        GenericObjectPoolConfig genericObjectPoolConfig = new GenericObjectPoolConfig();
        genericObjectPoolConfig.setMaxIdle(maxIdle);
        genericObjectPoolConfig.setMinIdle(minIdle);
        genericObjectPoolConfig.setMaxWaitMillis(maxWait);
        genericObjectPoolConfig.setMaxTotal(maxActive);
        return genericObjectPoolConfig;
    }

    @Bean
    //    配置redis标准连接配置对象
    public RedisStandaloneConfiguration createRedisStandaloneConfiguration(){
        //1.创建redis服务配置信息对象
        RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration();
        //设置redis服务器地址端口和密码
        redisStandaloneConfiguration.setHostName(host);
        redisStandaloneConfiguration.setPort(port);
        //3.返回
        return redisStandaloneConfiguration;
    }
}
