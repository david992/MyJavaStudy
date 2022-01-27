package com.study.service;

import com.study.service.impl.UserServiceImpl;

/**
 * @Program: MyJavaStudy
 * @ClassName: userServiceFactory
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-09-22 15:27
 * @Version: V1.0
 */
public class UserServiceFactory {
    public static UserService getService() {
        System.out.println("静态工厂创建");
        return new UserServiceImpl();
    }
}
