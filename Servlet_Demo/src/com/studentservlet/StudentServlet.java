package com.studentservlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;

/**
 * @author David
 * @Title:
 * @Package
 * @Description:
 * @date 2021/6/621:54
 */
public class StudentServlet extends HttpServlet {
    @Override
    /*(请求对象，响应对象)*/
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取数据 并保存
        String username = req.getParameter("username");
        String age = req.getParameter("age");
        String grade = req.getParameter("grade");

        String contextPath = req.getContextPath();
        System.out.println("获取虚拟目录名称"+contextPath);

        System.out.println("-----------------------------------");
        String servletPath = req.getServletPath();
        System.out.println("获取servlet映射路径"+servletPath);

        System.out.println("-----------------------------------");
        String remoteAddr = req.getRemoteAddr();
        System.out.println("获取访问者ip"+remoteAddr);

        System.out.println("-----------------------------------");
        String requestURI = req.getRequestURI();
        System.out.println("获取统一资源标志符"+requestURI);

        System.out.println("-----------------------------------");
        StringBuffer requestURL = req.getRequestURL();
        System.out.println("获取请求资源定位符"+requestURL);

        System.out.println("-----------------------------------");
        String queryString = req.getQueryString();
        System.out.println("获取请求的消息数据"+queryString);

        System.out.println("*************获取请求头信息*******************");
        String connection = req.getHeader("connection");
        System.out.println("根据请求头获取"+connection);

        System.out.println("-----------------------------------");
        Enumeration<String> headers = req.getHeaders("accept-encoding");
        while(headers.hasMoreElements()){
            String s = headers.nextElement();
            System.out.println("根据请求头获取多个值"+s);
        }
        System.out.println("-----------------------------------");
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()){
            String s = headerNames.nextElement();
            System.out.println("获取多个请求头，根据单个名称获取值"+req.getHeader(s));
        }

        System.out.println("****************************************");
        System.out.println("*************获取请求参数信息**************");
        System.out.println("****************************************");
        String username1 = req.getParameter("username");
        System.out.println("根据名称获取属性值"+username1);

        String[] hobbies = req.getParameterValues("hobbies");
        for (String hobby : hobbies) {
            System.out.println(hobby);
        }
        Enumeration<String> parameterNames = req.getParameterNames();
        while (parameterNames.hasMoreElements()){
            String s = parameterNames.nextElement();
            System.out.println("获取所有的名称后遍历"+s);
        }

        /*返回map集合*/
        Map<String, String[]> parameterMap = req.getParameterMap();
        for(String key: parameterMap.keySet()){
            String[] values = parameterMap.get(key);
            for (String value : values) {
                System.out.println(key+":"+value);
            }
        };
        System.out.println();


        //采用字符输出
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\Idea Projects\\MyJavaStudy\\Servlet_Demo\\web\\stu.txt",true) );
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
