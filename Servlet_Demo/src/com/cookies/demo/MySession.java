package com.cookies.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Program: MyJavaStudy
 * @ClassName: MySession
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-06-10 19:46
 * @Version: V1.0
 */
@WebServlet("/MySession01")
public class MySession extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求用户名
        String username = req.getParameter("username");

        //获取HTTPSession对象
        //接口指向实现类对象 多态
        HttpSession session = req.getSession();
        System.out.println(session.getId());

        //将用户名信息存在共享数据中
        session.setAttribute("username",username);

        //禁用cooki后的url重写
        resp.setContentType("text/html;charset=utf-8") ;
        resp.getWriter().write("<a href='"+resp.encodeURL("http://localhost:8080/Servlet_Demo_war_exploded/MySession03")+"'>携带cookie访问</a>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
