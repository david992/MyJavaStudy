package com.test.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.ResourceBundle;

/**
 * @Program: MyJavaStudy
 * @ClassName: JedisUtils
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-07-30 18:22
 * @Version: V1.0
 */
public class JedisUtils {
    private static int maxTotal;
    private static int MaxIdle;
    private static String host;
    private static int port;

    private static JedisPoolConfig jpc;
    private static JedisPool jp ;

    static{
        ResourceBundle bundle = ResourceBundle.getBundle("redis");
        maxTotal =Integer.parseInt(bundle.getString("redis.maxTotal")) ;
        MaxIdle =Integer.parseInt(bundle.getString("redis.maxIdle"));
        host = bundle.getString("redis.host");
        port = Integer.parseInt(bundle.getString("redis.port"));
        //jedis连接池配置
        jpc = new JedisPoolConfig();
        jpc.setMaxTotal(maxTotal);//最大连接池
        jpc.setMaxIdle(MaxIdle);//最大活动连接数
        //String host = "127.0.0.1";
        //int port = 6379;
        //连接池对象
        jp = new JedisPool(jpc, host, port);
    }
    public static Jedis getJedis(){

        return jp.getResource();
    }
}
