package com.studentservlet;

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
 * @ClassName: addstudentservletdemo01
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-06-09 20:12
 * @Version: V1.0
 */
@WebServlet("/addstudentservletdemo02")
public class addstudentservletdemo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建字符输入流对象关联文件
        String realPath = getServletContext().getRealPath("/stu.txt");
        System.out.println(realPath);
        BufferedReader br = new BufferedReader(new FileReader(realPath));

        ArrayList<Student> arrayList = new ArrayList<>();

        String line;
        while ((line = br.readLine())!=null){
            Student stu = new Student();
            String [] arr = line.split(",");
            stu.setUsername(arr[0]);
            stu.setAge(arr[1]);
            stu.setGrade(arr[2]);
            //stu.setHobbies(arr[3]);
            arrayList.add(stu);
        }
        resp.setContentType("text/html;charset=UTF-8");
        //获取输出流对象
        PrintWriter writer = resp.getWriter();
        for (Student student : arrayList) {
            writer.write(student.getUsername()+","+student.getAge());
            writer.write("<br>");
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
