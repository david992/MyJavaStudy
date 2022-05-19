package com.study.service;

import com.study.config.SpringConfig;
import com.study.domain.Account;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.Jedis;

/**
 * @Program: MyJavaStudy
 * @ClassName: UserServiceTest
 * @Author: David_J
 * @Copyright David
 * @Date: 2022-03-11 16:05
 * @Version: V1.0
 */
//设定spring专用类加载器
@RunWith(SpringJUnit4ClassRunner.class)
//设定加载的spring上下文对应的值
@ContextConfiguration(classes = SpringConfig.class)
public class UserServiceTest {
    BeanFactory bf;
    @Autowired
    private AccountService accountService;
    @Test
    public void testFindByID(){
    Account ac = accountService.findById(1);
    Assert.assertEquals("david",ac.getName());
    }



}

