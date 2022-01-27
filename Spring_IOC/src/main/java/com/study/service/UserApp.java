package com.study.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Program: MyJavaStudy
 * @ClassName: UserApp
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-08-26 16:01
 * @Version: V1.0
 */
public class UserApp {
    public static void main(String[] args) {
        // ③ 使用资源
        //2.加载配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //3.获取资源
        UserService userService = (UserService) ctx.getBean("userServiceList");
        userService.save();
    }
}
