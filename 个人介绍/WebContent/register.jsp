<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
<title>Register</title>
<script>
 window.onload=function(){
	 var in1=document.getElementById("p1");
	 var in2=document.getElementById("p2");
	 var in1v=in1.value;
	 var in2v=in2.value;
	 var but=document.getElementById("p4");
	 but.onclick=function aaa(){
	 if(in1v!=in2v)
		 alert("两次输入密码不一致");
	 in1v= "";
	 in2v= ""; 
	 };
 };
 
 
 </script>
</head>
<body>
<h1>Register</h1>
<div class="login1">
<div class="login2">
<form action="check1.jsp" method="post">
<label>用户名</label>
<input class="user" type="text" name="uname" /><br/>
<label>密码</label>
<input id="p2"  class="user" type="password" name="upwd" /><br/>
<label>确认密码</label>
<input id="p1"  class="user"  type="text" name="eupwd" /><br/>
<label>电子邮箱</label>
<input class="user" type="text" name="email" /><br/>
<div class="sub1">
<input id="p4" type="submit" value="REGISTER" />
</div>
</form>
</div>
</div>
</body>
</html>