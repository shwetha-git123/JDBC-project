package com.ty;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InfosysGetDetails {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/infosyshiring","root","root");
			Statement statement=connection.createStatement();
			ResultSet result=statement.executeQuery("select * from hiring");
			while(result.next()) {
				System.out.println("Id:"+result.getInt(1));
				System.out.println("Name:"+result.getString(2));
				System.out.println("Age:"+result.getInt(3));
				System.out.println("Designation:"+result.getString(4));
				System.out.println("Salary:"+result.getInt(5));
				System.out.println("Experience:"+result.getInt(6));
			}

	}
		catch (ClassNotFoundException | SQLException e)
		{
			
			e.printStackTrace();
		}
	}

}
