package com.student.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Program: MyJavaStudy
 * @ClassName: ListStudentServlet
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-06-11 18:09
 * @Version: V1.0
 */
@WebServlet("/liststudentservlet")
public class ListStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        //根据相对路径获取绝对路径
        String realPath = getServletContext().getRealPath("/stu.txt");
        //创建字符流输入对象
        //关联文本
        BufferedReader br = new BufferedReader(new FileReader(realPath));
        ArrayList<Student> arrayList = new ArrayList<Student>();

        String line ;
        while ((line = br.readLine())!=null){
            Student stu = new Student();
            String[] arr = line.split(",");
            stu.setUsername(arr[0]);
            stu.setAge(arr[1]);
            stu.setGrade(arr[2]);
            stu.setHobbies(new String[]{arr[3]});
            arrayList.add(stu);

        }

        resp.setContentType("text/html;charset=UTF-8");

        //获取输出流对象
        PrintWriter writer = resp.getWriter();
        for(Student stu :arrayList){
            writer.write(stu.getUsername()+","+stu.getAge()+","+stu.getGrade()+","+ Arrays.toString(stu.getHobbies()));
            writer.write("<br>");
            System.out.println(stu.getHobbies());
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
