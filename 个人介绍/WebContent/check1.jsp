<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page  import="个人介绍.RegisterDao" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>check1.jsp</title>
</head>
<body>
<%
     String name=request.getParameter("uname");
     String pwd=request.getParameter("upwd");
     String email=request.getParameter("email");
     RegisterDao dao=new RegisterDao();
     int count=dao.register(name, pwd,email);
     if(count>0)
    	 request.getRequestDispatcher("login.jsp").forward(request,response);
     else
    	 out.print("注册失败");
%>
</body>
</html>