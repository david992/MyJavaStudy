package com.study.dao2.impl;

import com.study.dao2.UserDao;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * @Program: MyJavaStudy
 * @ClassName: UserDaoImpl
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-10-09 16:46
 * @Version: V1.0
 */

@Component("userDao2")
@DependsOn("userService")
public class UserDaoImpl2 implements UserDao {
    public UserDaoImpl2() {
        System.out.println("UserDaoImpl2");
    }

    public void save(){
        System.out.println("UserDao2  service running");
    }
}
