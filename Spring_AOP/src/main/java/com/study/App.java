package com.study;

import base.decorator.UserServiceImplDecorator;
import base.proxy.UserServiceJDKProxy;
//import base.cglib.UserServiceCglibProxy;
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
        UserService userService1 = new UserServiceImpl();
        userService.save();
        userService.canshu(666);
        System.out.println("app .... "+userService.update());
        userService.delete();

//        UserServiceImplDecorator userServiceImplDecorator = new UserServiceImplDecorator(userService1);
//        userServiceImplDecorator.save();

//        UserService userServiceJDKProxy = UserServiceJDKProxy.creatUserServiceJDKProxy(userService1);
//        userServiceJDKProxy.save();

//        UserService userService2 = UserServiceCglibProxy.creatUserServiceCglibProxy(UserServiceImpl.class);
//        userService2.save();





    }
}
