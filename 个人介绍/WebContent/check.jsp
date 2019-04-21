<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ page  import="个人介绍.LoginDao" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>check</title>
</head>
<body>
<%
     String name=request.getParameter("uname");
     String pwd=request.getParameter("upwd");
     LoginDao dao=new LoginDao();
     int count=dao.login(name, pwd);
     if(count>0)
    	 request.getRequestDispatcher("homepage.html").forward(request,response);
     else
    	 out.print("登录失败");
%></body>
</html>