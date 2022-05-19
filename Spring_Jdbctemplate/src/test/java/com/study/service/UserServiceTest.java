package com.study.service;

import com.study.config.SpringConfig;
import com.study.domain.Account;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
    public void testSave(){
        Account account = new Account();
        account.setName("我是傻逼 ");
        account.setMoney(99.99d);
        accountService.save(account);
    }


}
