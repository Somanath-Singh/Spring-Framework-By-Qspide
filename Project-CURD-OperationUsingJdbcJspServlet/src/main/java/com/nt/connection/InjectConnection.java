package com.nt.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InjectConnection {

	public static Connection connection = null;

	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeoperation", "root", "root");
		System.out.println(connection);
		return connection;
	}
	
	

}
