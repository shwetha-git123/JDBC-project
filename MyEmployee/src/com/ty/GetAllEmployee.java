package com.ty;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class GetAllEmployee {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/myemployee","root","root");
			PreparedStatement preparedstatement=connection.prepareStatement("select * from employee");
			ResultSet result=preparedstatement.executeQuery();
			while(result.next()) {
				System.out.println("Id:"+result.getInt(1));
				System.out.println("Name:"+result.getString(2));
				System.out.println("Age:"+result.getInt(3));
				System.out.println("Gender:"+result.getString(4));
				System.out.println("Phno:"+result.getInt(5));
				System.out.println("Salary:"+result.getDouble(6));
	}
			connection.close();
	
		}
catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}

	}

}
