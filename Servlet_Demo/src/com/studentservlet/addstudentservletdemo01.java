package com.studentservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * @Program: MyJavaStudy
 * @ClassName: addstudentservletdemo01
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-06-09 20:12
 * @Version: V1.0
 */
@WebServlet("/addstudentservletdemo01")
public class addstudentservletdemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取表单数据
        String username = req.getParameter("username");
        String age = req.getParameter("age");
        String grade = req.getParameter("grade");
        String[] hobbies = req.getParameterValues("hobbies");

        Student stu = new Student();
        stu.setAge(age);
        stu.setUsername(username);
        stu.setGrade(grade);
        stu.setHobbies(hobbies);

        //保存
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\Idea Projects\\MyJavaStudy\\Servlet_Demo\\web\\stu.txt",true));
        bw.write(stu.getUsername()+","+stu.getAge()+","+stu.getGrade()+","+Arrays.toString(stu.getHobbies()));
        bw.newLine();//换行
        bw.close();
        System.out.println(stu);
        System.out.println(Arrays.toString(stu.getHobbies()));
        //响应给浏览器
        resp.setContentType("text/html;charset=UTF-8");
        //获取字符输出流
        resp.getWriter().write("添加成功，两秒后自动跳转首页");

        resp.setHeader("Refresh","2;URL="+req.getContextPath()+"/index.jsp");




    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
