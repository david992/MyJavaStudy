<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: win10
  Date: 2021/6/4
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="/addStudent.html" pageEncoding="GBK" %>
<html>
  <head>

    <title>学生管理系统首页</title>
  </head>
  <body>
<%--  <% int res = 1/0;%>--%>
  <% ArrayList list = new ArrayList();%>


<%--9大隐式对象--%>
<% out.print("Sss");
pageContext.getRequest();
%>

<%@include file="/addStudent.html"%>


<%--  跳转页面--%>
  <a href="/Servlet_Demo_war_exploded/addStudent.html">添加学生</a>
<%--  跳转功能类--%>
  <a href="/Servlet_Demo_war_exploded/addstudentservletdemo02">查看学生</a>

  <%--代码块 --%>
  <% out.println("<br>这是代码块<br>"); %>
  <%--表达式 --%>
  <%="表达式<br>" %>
  <%-- 申明    加!表示成员变量/成员方法
              不加！表示局部变量/（方法中的方法）
   --%>
  <%! String s="变量";%>
  <%=s%>
  </body>
</html>
