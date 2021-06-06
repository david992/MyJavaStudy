package com.example.demo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Program: test
 * @ClassName: MyServlet2
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-06-03 17:13
 * @Version: V1.0
 */
public class MyHttpServlet2 extends HttpServlet {
    private String username;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("已接收到客户端请求");
        int money = 1000;
        String info;
        synchronized (this) {
            username = req.getParameter("username");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String path = req.getRequestURI();
            path = path.substring(path.lastIndexOf("/"));
            if("/vip".equals(path)){
                 info = "您是超级会员0.8折，折后"+(money * 0.8)+"元";

            }else if ("/sip".equals(path)){
                 info = "您是超级会员0.65折，折后"+(money * 0.65)+"元";
            }else{
                info = "很遗憾您还未成为会员，暂无折扣!";

            }


            PrintWriter pw = resp.getWriter();
            pw.println("welcome" + username+","+info);
        }
        System.out.println(info);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    public void destroy() {
        System.out.println("对象已销毁");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("对象初始化成功");
    }
}
