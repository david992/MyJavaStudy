package com.servletdemo.edu;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Program: MyJavaStudy
 * @ClassName: MyHttpServlet3
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-06-09 14:20
 * @Version: V1.0
 */
@WebServlet("/MyHttpServlet03")
public class MyHttpServlet3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        //获取全局配置参数
        System.out.println(servletContext.getInitParameter("globalDesc"));
        //获取应用虚拟目录
        System.out.println(servletContext.getContextPath());
        //根据虚拟目录获取绝对目录
        System.out.println(servletContext.getRealPath("/"));

        servletContext.setAttribute("username","zhangsan");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         doPost(req, resp);
    }
}
