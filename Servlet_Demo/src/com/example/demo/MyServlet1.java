package com.example.demo;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @Program: test
 * @ClassName: com.example.com.example.demo.MyServlet1
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-06-03 14:00
 * @Version: V1.0
 */
public class MyServlet1 extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("执行了");
    }
}
