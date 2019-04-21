<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
</head>
<body>
<h1>login</h1>
<div class="login1">
<div class="login2">
<form action="check.jsp" method="post">
<label>用户名</label>
<input class="user" type="text" name="uname" /><br/>
<label>密码</label>
<input class="psw" type="password" name="upwd" /><br/>
<input type="submit" value="LOGIN"/>
</form>
<div class="number1">
<h3>Not A Number</h3>
<a href="register.jsp" class="number1_right">Register Here</a>
</div>
</div>
</div>
</body>
</html>