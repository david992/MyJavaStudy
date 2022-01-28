package com.study;

import com.alibaba.druid.pool.DruidDataSource;
import com.study.config.SpringConfig;
import com.study.config.SpringConfig2;
import com.study.dao2.BookDao;
import com.study.dao2.UserDao;
import com.study.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
//        // ③ 使用资源
//        //2.加载配置文件
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        //3.获取资源
//        UserService userService = (UserService) ctx.getBean("userServiceList");
//        userService.save();


        //注解
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-component.xml");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class, SpringConfig2.class);
        UserService userService = (UserService) ctx.getBean("userService");

        userService.save();
//        UserDao userDao = (UserDao) ctx.getBean("userDao");
//        userDao.save();
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        bookDao.save();
        DruidDataSource ds = (DruidDataSource) ctx.getBean("dataSource");
        System.out.println(ds);
    }
}
