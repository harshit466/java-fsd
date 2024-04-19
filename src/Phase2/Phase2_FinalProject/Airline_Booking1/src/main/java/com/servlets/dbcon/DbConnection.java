package com.servlets.dbcon;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	
	public static Connection getConnection()
	{
		Connection conObj = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectf","root", "Harshit@464");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return conObj;
	}
}