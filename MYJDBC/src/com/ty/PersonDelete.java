package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonDelete{
	public static void main(String[] args) {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","root");
		Statement statement=connection.createStatement();
		statement.execute("delete from Person where id=500");
		connection.close();
		System.out.println("data saved");
	} 
	catch (ClassNotFoundException | SQLException e) 
	{
		e.printStackTrace();
	}
}
}

