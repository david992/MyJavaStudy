package com.study;

import com.study.service.Impl.UserServiceImpl;
import com.study.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author David
 * @Title:
 * @Package
 * @Description:
 * @date 2022/3/2822:00
 */
public class App {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService)ctx.getBean("userService");
        userService.save();

    }
}
