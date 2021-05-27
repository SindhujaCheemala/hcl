package com.hcl.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private final static String url="jdbc:mysql://localhost:3306/EmployeeProcedure";
	private final static String UserName="root";
	private final static String passWord="Sindhu20";
	private DBConnection() {
		
	}
	private static Connection con =null;
	public static Connection getConnection() {
		
		try {
			if(con==null)
			con= DriverManager.getConnection(url,UserName,passWord);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}
	
}
