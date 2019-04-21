package ���˽���;

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
  	 	// �����������ؾ����������
  	 	Class.forName("com.mysql.jdbc.Driver");// ���ؾ���
  	 	// �����ݿ⽨������
  	 	connection = DriverManager.getConnection(URL, USERNAME, PWD);
  	 	// ����sql���ִ��sql����(ִ�������࣬��ɾ�ģ��飩
  	 	String sql = "insert into user values(?,?,?)";
		pstmt=connection.prepareStatement(sql);//Ԥ����
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
