package com.study.dao2.impl;

import com.study.dao2.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Properties;

/**
 * @Program: MyJavaStudy
 * @ClassName: BookDaoImpl
 * @Author: David_J
 * @Copyright David
 * @Date: 2022-01-25 14:57
 * @Version: V1.0
 */
@Component
@Primary//提高优先级
@PropertySource(value = {"classpath:jdbc.properties","classpath:cccc.properties"},ignoreResourceNotFound = true)
public class BookDaoImpl implements BookDao {
    @Value("${jdbc.username}")
    private String title;
    @Value("${jdbc.password}")
    private String author;
    @Override
    public void save(){
        System.out.println("BookDao1  service running ,"+title+","+author);
    }
}
