package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Person {

	public static void main(String[] args) {
		
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","root");
	Statement statement=connection.createStatement();
	//statement.execute("insert into person values(100,'shwetha',23,'female')");
	statement.execute("insert into person values(200,'anjali',24,'female')");
	statement.execute("insert into person values(300,'smita',20,'female')");
	statement.execute("insert into person values(400,'sharat',18,'male')");
	statement.execute("insert into person values(500,'bharat',23,'male')");
	connection.close();
	System.out.println("data saved");
} catch (ClassNotFoundException | SQLException e) {
	e.printStackTrace();
}

	}

}
