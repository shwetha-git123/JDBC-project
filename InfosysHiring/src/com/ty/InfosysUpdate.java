package com.ty;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class InfosysUpdate {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/infosyshiring","root","root");
		Statement statement=connection.createStatement();
		statement.execute("update hiring set salary=78000 where experience>20");
		connection.close();
		System.out.println("saved");
}
	catch (ClassNotFoundException | SQLException e)
	{
		
		e.printStackTrace();
	}
}
}
