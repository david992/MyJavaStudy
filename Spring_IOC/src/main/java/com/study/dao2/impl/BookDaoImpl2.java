package com.study.dao2.impl;

import com.study.dao2.BookDao;
import org.springframework.stereotype.Component;

/**
 * @Program: MyJavaStudy
 * @ClassName: BookDaoImpl
 * @Author: David_J
 * @Copyright David
 * @Date: 2022-01-25 14:57
 * @Version: V1.0
 */
@Component
public class BookDaoImpl2 implements BookDao {

    @Override
    public void save(){
        System.out.println("BookDao2  service running");
    }
}
