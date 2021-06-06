package com.studentservlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author David
 * @Title:
 * @Package
 * @Description:
 * @date 2021/6/621:54
 */
public class StudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取数据 并保存
        String username = req.getParameter("username");
        String age = req.getParameter("age");
        String grade = req.getParameter("grade");

        //采用字符输出
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\IdeaProjects\\MyJavaStudy\\Servlet_Demo\\web\\stu.txt",true) );
        bw.write(username+","+age+","+grade);
        bw.newLine();
        bw.close();

        //响应客户端浏览器
        PrintWriter pw = resp.getWriter();
        pw.println("save success");
        pw.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
