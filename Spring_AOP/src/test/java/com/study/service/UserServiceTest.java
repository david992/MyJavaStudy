package com.study.service;

import com.study.config.SpringConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Program: MyJavaStudy
 * @ClassName: UserServiceTest
 * @Author: David_J
 * @Copyright David
 * @Date: 2022-03-31 11:11
 * @Version: V1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= SpringConfig.class)
public class UserServiceTest {
    @Autowired
    private UserService userService;
    @Test
    public void testUpdate(){
        Assert.assertEquals(100,userService.update());

    };
}
