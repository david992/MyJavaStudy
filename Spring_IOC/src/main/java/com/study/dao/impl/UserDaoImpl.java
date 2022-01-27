package com.study.dao.impl;

import com.study.dao.UserDao;

/**
 * @Program: MyJavaStudy
 * @ClassName: UserDaoImpl
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-10-09 16:46
 * @Version: V1.0
 */
public class UserDaoImpl implements UserDao {
    public String user;
    public String pwd;
    public String driver;
//构造方法注入
    public UserDaoImpl( String driver,String user, String pwd) {
        this.user = user;
        this.pwd = pwd;
        this.driver = driver;
    }

    public void save(){
        System.out.println("UserDao  service running" +user+" ,"+pwd+" ,"+driver);
    }
}
