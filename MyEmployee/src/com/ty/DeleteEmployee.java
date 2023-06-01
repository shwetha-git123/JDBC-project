package com.ty;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteEmployee {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the emp id");
		int id=scan.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/myemployee","root","root");
			PreparedStatement preparedstatement=connection.prepareStatement("delete from employee where id=?");
			preparedstatement.setInt(1, id);

			preparedstatement.execute();
			
			connection.close();
			
			System.out.println("record deleted");

		}
		catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}

	}

}
