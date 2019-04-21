package 个人介绍;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class RegisterDao {
	 public int register(String name, String pwd,String email) {
  	   String URL = "jdbc:mysql://localhost:3306/test";
  	   String USERNAME = "root";
  	   String PWD = "123456";
  	 PreparedStatement pstmt=null;
  	 Connection connection = null;
  	 ResultSet rs=null;
  	 try {
  	 	// 导入驱动加载具体的驱动类
  	 	Class.forName("com.mysql.jdbc.Driver");// 加载具体
  	 	// 与数据库建立链接
  	 	connection = DriverManager.getConnection(URL, USERNAME, PWD);
  	 	// 发送sql语句执行sql命令(执行两大类，增删改，查）
  	 	String sql = "insert into user values(?,?,?)";
		pstmt=connection.prepareStatement(sql);//预编译
		pstmt.setString(1, name);
		pstmt.setString(2, pwd);
		pstmt.setString(3, email);
		int count=pstmt.executeUpdate();
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
  	 		 
  	 	if(pstmt!=null)pstmt.close();
  	 	connection.close();
  	 	}catch(SQLException e) {
  	 		e.printStackTrace();
  	 	}
  	 }
     }

}
