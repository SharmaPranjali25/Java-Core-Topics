package com.test.JDBCExp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExp1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url= "jdbc:mysql://localhost:3306/java";
		String user= "root";
		String password="root@39";
		
		//1. load the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2 create connection object
		Connection con= DriverManager.getConnection(url,user,password);
		//3 create statement object
		Statement stmt= con.createStatement();
		//String sql = "CREATE TABLE mlasuser(id INT, name VARCHAR(50), city VARCHAR(10))";
		String sql= "insert into mlasuser values(1,'Prnjali','Mandi')";

		//4 execute the query
		stmt.execute(sql);
		//5 close the connection
		con.close();
		System.out.println("Done JDBC");
	}

}
