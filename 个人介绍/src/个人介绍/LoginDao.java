package 个人介绍;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao {
           public int login(String name, String pwd) {
        	   String URL = "jdbc:mysql://localhost:3306/test";
        	   String USERNAME = "root";
        	   String PWD = "123456";
        	 Statement stmt = null;
        	 Connection connection = null;
        	 ResultSet rs=null;
        	 try {
        	 	// 导入驱动加载具体的驱动类
        	 	Class.forName("com.mysql.jdbc.Driver");// 加载具体
        	 	// 与数据库建立链接
        	 	connection = DriverManager.getConnection(URL, USERNAME, PWD);
        	 	// 发送sql语句执行sql命令(执行两大类，增删改，查）
        	 	stmt = connection.createStatement();
        	 	//String sql = "insert into test_test values(1,2)";插入语句
        	 	//String sql="update test_test set id=2 where content=2";
        	 	//String name=request.getParameter("uname");
        	     //String pwd=request.getParameter("upwd");
        	 	String sql="select count(*) from user where id='"+name+"' and psw='"+pwd+"'";//查询语句
        	 	// 执行sql语句
        	 	 rs = stmt.executeQuery(sql);
        	 	// 处理结果集
        	 	int count=-1;
        	 	 while(rs.next()) {
        	 		 count=rs.getInt(1);
        	 	 }/*
        	 	 if(count>0){
        	 		 request.getRequestDispatcher("homepage.html").forward(request, response);
        	 	 }
        	 	 else{
        	 		 out.println("登陆失败");
        	 	 }*/
        	 	 return count;
        	 } catch (ClassNotFoundException e) {
        	 	e.printStackTrace();
                return -1;
        	 } 
        	 catch (SQLException e) {
        	 	e.printStackTrace();
        	 	 return -1;
        	 }
        	 catch (Exception e) {
        	 	e.printStackTrace();
        	 	 return -1;
        	 }
        	 finally {
        	 	try {
        	 		if(rs!=null) rs.close();
        	 	if(stmt!=null)stmt.close();
        	 	connection.close();
        	 	}catch(SQLException e) {
        	 		e.printStackTrace();
        	 	}
        	 }
           }
}
