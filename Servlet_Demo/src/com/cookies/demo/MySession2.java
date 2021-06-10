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
@WebServlet("/MySession02")
public class MySession2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //获取HTTPSession对象
        HttpSession session = req.getSession();
        System.out.println(session.getId());

        //获取共享数据
        Object username = session.getAttribute("username");

        //响应给客户端
        resp.getWriter().write(username+"");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
