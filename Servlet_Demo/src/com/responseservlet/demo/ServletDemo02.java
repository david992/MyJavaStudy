package com.responseservlet.demo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Program: MyJavaStudy
 * @ClassName: ServletDemo01
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-06-09 16:18
 * @Version: V1.0
 */

/*
字节流响应消息
* */
@WebServlet("/ServletDemo02")
public class ServletDemo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置编码格式
        resp.setContentType("text/html;charset=UTF-8");
        //获取字节流输出对象
        ServletOutputStream os = resp.getOutputStream();
        //字符串转字符数组 str.getBytes()
        String str = "hello world";
        os.write(str.getBytes());
//
//        //获取字符流输出对象
//        PrintWriter writer = resp.getWriter();
//        String str1 = "字符流输出对象";
//        writer.write(str1);

        //设置缓存 1个小时
        //resp.setDateHeader("Expires",System.currentTimeMillis()+(1*60*60*100));
        //定时刷新 配合setStatus(302)可以实现重定向
        //resp.setStatus(302);
        //resp.setHeader("Location","URL=/Servlet_Demo_war_exploded/addStudent.html")
        //resp.setHeader("Refresh","1;URL=/Servlet_Demo_war_exploded/addStudent.html");

        //重定向
        resp.sendRedirect(req.getContextPath()+"/ServletDemo01");
        System.out.println("收到请求");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         doPost(req, resp);
    }
}
