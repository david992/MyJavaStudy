package com.student.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Program: MyJavaStudy
 * @ClassName: AddStudentServlet
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-06-11 18:09
 * @Version: V1.0
 */
@WebServlet("/addstudentservlet")
public class AddStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("111");


        //根据相对路径获取绝对路径
        String realPath = getServletContext().getRealPath("/stu.txt");
        //创建字符流输入对象
        //关联文本
        BufferedWriter bw = new BufferedWriter(new FileWriter(realPath,true));

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

        System.out.println(stu);
        bw.write(stu.getUsername()+","+stu.getAge()+","+stu.getGrade()+","+ Arrays.toString(stu.getHobbies()));
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
