package com.study.dao2.impl;

import com.study.dao2.UserDao;
import org.springframework.stereotype.Component;

/**
 * @Program: MyJavaStudy
 * @ClassName: UserDaoImpl
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-10-09 16:46
 * @Version: V1.0
 */

@Component("userDao1")
public class UserDaoImpl implements UserDao {

    public void save(){
        System.out.println("UserDao1  service running");
    }
}
