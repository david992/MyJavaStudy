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

    <title>ѧ������ϵͳ��ҳ</title>
  </head>
  <body>
<%--  <% int res = 1/0;%>--%>
  <% ArrayList list = new ArrayList();%>


<%--9����ʽ����--%>
<% out.print("Sss");
pageContext.getRequest();
%>

<%@include file="/addStudent.html"%>


<%--  ��תҳ��--%>
  <a href="/Servlet_Demo_war_exploded/addStudent.html">���ѧ��</a>
<%--  ��ת������--%>
  <a href="/Servlet_Demo_war_exploded/addstudentservletdemo02">�鿴ѧ��</a>

  <%--����� --%>
  <% out.println("<br>���Ǵ����<br>"); %>
  <%--���ʽ --%>
  <%="���ʽ<br>" %>
  <%-- ����    ��!��ʾ��Ա����/��Ա����
              ���ӣ���ʾ�ֲ�����/�������еķ�����
   --%>
  <%! String s="����";%>
  <%=s%>
  </body>
</html>
