package ���˽���;

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
        	 	// �����������ؾ����������
        	 	Class.forName("com.mysql.jdbc.Driver");// ���ؾ���
        	 	// �����ݿ⽨������
        	 	connection = DriverManager.getConnection(URL, USERNAME, PWD);
        	 	// ����sql���ִ��sql����(ִ�������࣬��ɾ�ģ��飩
        	 	stmt = connection.createStatement();
        	 	//String sql = "insert into test_test values(1,2)";�������
        	 	//String sql="update test_test set id=2 where content=2";
        	 	//String name=request.getParameter("uname");
        	     //String pwd=request.getParameter("upwd");
        	 	String sql="select count(*) from user where id='"+name+"' and psw='"+pwd+"'";//��ѯ���
        	 	// ִ��sql���
        	 	 rs = stmt.executeQuery(sql);
        	 	// ��������
        	 	int count=-1;
        	 	 while(rs.next()) {
        	 		 count=rs.getInt(1);
        	 	 }/*
        	 	 if(count>0){
        	 		 request.getRequestDispatcher("homepage.html").forward(request, response);
        	 	 }
        	 	 else{
        	 		 out.println("��½ʧ��");
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
