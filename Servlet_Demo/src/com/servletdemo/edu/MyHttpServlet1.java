package com.servletdemo.edu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Program: MyJavaStudy
 * @ClassName: MyHttpSrvlet1
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-06-04 20:15
 * @Version: V1.0
 */
@WebServlet("/zhujie1")
public class MyHttpServlet1 extends HttpServlet {
/*
* 自动注解开发*/

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("注解执行ing");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
