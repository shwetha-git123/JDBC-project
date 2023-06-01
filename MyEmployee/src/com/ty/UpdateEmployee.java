package com.ty;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateEmployee {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the emp id");
		int id=scan.nextInt();
		
		System.out.println("Enter the emp salary");
		double sal=scan.nextDouble();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/myemployee","root","root");
			PreparedStatement preparedstatement=connection.prepareStatement("update  employee set sal=? where id=?");
			preparedstatement.setDouble(1,sal);
			preparedstatement.setInt(2,id);
			
			preparedstatement.execute();
			
			connection.close();
			
			System.out.println("data updated");

	}
		catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}

}
