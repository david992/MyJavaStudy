package com.study.service;

import com.study.config.SpringConfig;
import com.study.domain.Account;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.Jedis;

/**
 * @Program: MyJavaStudy
 * @ClassName: testUserSevice
 * @Author: David_J
 * @Copyright David
 * @Date: 2022-05-19 18:03
 * @Version: V1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class UserServiceTest {
    @Autowired
    private AccountService accountService;


    @Test
    public void testRedis(){
        Jedis jedis = new Jedis("127.0.0.1",36379);
        System.out.println(jedis);
        jedis.set("name2","david2");
        jedis.close();
    }
    @Test
    public void testSave(){
        Account account = new Account();
        account.setName("测试");
        account.setMoney(99.99);
    }
    @Test
    public void testChangeMoney(){
        accountService.changeMoney(1,88.88D);
    }

    @Test
    public void testFindMoney(){
        accountService.findMoney(1);
    }

}
