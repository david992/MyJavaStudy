package com.cookies.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Program: MyJavaStudy
 * @ClassName: MyCookies
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-06-10 18:49
 * @Version: V1.0
 */
@WebServlet("/mycookies01")
public class MyCookies extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 通过响应对象写出提示信息
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter pw = resp.getWriter();
        pw.write("欢迎访问mycookies页面");

        //创建cooike对象 记录最后访问时间
        Cookie cookie = new Cookie("time", System.currentTimeMillis() + "");

        //设置最大存活时间
        cookie.setMaxAge(3600);

        //cookie对象添加到客户端
        resp.addCookie(cookie);

        //获取cookie
        Cookie arr[]= req.getCookies();
        for (Cookie c : arr) {
            if("time".equals(c.getName())){
                String value = c.getValue();//拿到的是字符格式
                //设置日期格式
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                pw.write(sdf.format(new Date(Long.parseLong(value))));
            }
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
