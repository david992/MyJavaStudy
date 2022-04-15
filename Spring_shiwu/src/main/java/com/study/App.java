package com.study;

import com.study.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Program: MyJavaStudy
 * @ClassName: App
 * @Author: David_J
 * @Copyright David
 * @Date: 2022-04-15 14:43
 * @Version: V1.0
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService service = (AccountService) ctx.getBean("accountService");
        service.transfer("david","lihui",100);
    }
}
