package com.student.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Program: MyJavaStudy
 * @ClassName: LoginStudentServlet
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-06-11 16:26
 * @Version: V1.0
 */
@WebServlet("/loginStudentServlet")
public class LoginStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if(username  ==null ||"".equals(username) ){
            resp.getWriter().write("请重新登录");
            resp.sendRedirect("/student/login.jsp");
            return;
        }
        //获取session对象 将用户名存入会话域
        req.getSession().setAttribute("username",username);
        resp.sendRedirect("/student/index.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          doGet(req, resp);
    }
}
