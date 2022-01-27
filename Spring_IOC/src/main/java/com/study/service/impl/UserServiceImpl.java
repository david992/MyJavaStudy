package com.study.service.impl;

import com.study.dao.BookDao;
import com.study.dao.UserDao;
import com.study.service.UserService;

/**
 * @Program: MyJavaStudy
 * @ClassName: UserServiceImpl
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-08-26 14:48
 * @Version: V1.0
 */
public class UserServiceImpl implements UserService {

    public int Num;
    private UserDao userDao;
    private BookDao bookDao;
//    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public UserServiceImpl(UserDao userDao, int Num) {
        this.userDao = userDao;
        this.Num = Num;
    }

    public UserServiceImpl() {
        System.out.println("running~~~");
    }

    public void  init(){ System.out.println("init~~~"); }

    public void  destroy(){  System.out.println("destroy~~~"); }
    public void setNum(int num) {
        Num = num;
    }
    //111.对需要注入的变量添加set方法
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(){
        System.out.println("UserService running......"+Num);
        userDao.save();
        bookDao.save();
    }
}
