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

/*
* 浏览器禁用cookie*/
@WebServlet("/MySession03")
public class MySession3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //获取HTTPSession对象
        HttpSession session = req.getSession(false);
        System.out.println(session);

        // 方法1
        if (session == null){

            resp.setContentType("text/html;charset=UTF-8");
            resp.getWriter().write("您已禁止浏览器cookie");
        }

        //方法2
        


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
