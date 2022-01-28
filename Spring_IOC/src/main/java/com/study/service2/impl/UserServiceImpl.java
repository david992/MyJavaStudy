package com.study.service2.impl;

import com.study.dao2.BookDao;
import com.study.dao2.UserDao;
import com.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Program: MyJavaStudy
 * @ClassName: UserServiceImpl
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-08-26 14:48
 * @Version: V1.0
 */
@Component("userService")
@Scope("singleton")
public class UserServiceImpl implements UserService {
    @Value("3")
    private int num;
    @Value("${jdbc.driver}")
    private String version;
    @Qualifier("userDao1")
    @Autowired
    private UserDao userDao;
    @Autowired
    private BookDao bookDao;
//    public void setNum(int num) {
//        this.num = num;
//    }
//
//    public void setVersion(String version) {
//        this.version = version;
//    }
public UserServiceImpl() {
    System.out.println("UserServiceImpl");
}
    @PostConstruct
    public void  init(){ System.out.println("init~~~"); }
    @PreDestroy
    public void  destroy(){  System.out.println("destroy~~~"); }


    public void save(){
        System.out.println("UserService running......"+num+","+version);
        userDao.save();
        bookDao.save();
    }
}
