package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Customer {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/dname","root","root");
			PreparedStatement preparedstatement=connection.prepareStatement("insert into Customer values(?,?,?,?,?,?)");
			preparedstatement.setInt(1, 101);
			preparedstatement.setString(2,"dhanya");
			preparedstatement.setInt(3, 20);
			preparedstatement.setInt(4, 78905679);
			preparedstatement.setString(5, "female");
			preparedstatement.setString(6, "dhamya123@gmail.com");
			preparedstatement.execute();
			
			preparedstatement.setInt(1, 102);
			preparedstatement.setString(2,"kavya");
			preparedstatement.setInt(3, 21);
			preparedstatement.setInt(4, 89056719);
			preparedstatement.setString(5, "female");
			preparedstatement.setString(6, "kavya123@gmail.com");
			preparedstatement.execute();
			
			preparedstatement.setInt(1, 103);
			preparedstatement.setString(2,"Ajay");
			preparedstatement.setInt(3, 25);
			preparedstatement.setInt(4, 98905679);
			preparedstatement.setString(5, "male");
			preparedstatement.setString(6, "ajay123@gmail.com");
			preparedstatement.execute();
			
			preparedstatement.setInt(1, 104);
			preparedstatement.setString(2,"tarun");
			preparedstatement.setInt(3, 23);
			preparedstatement.setInt(4, 78905669);
			preparedstatement.setString(5, "male");
			preparedstatement.setString(6, "tarun123@gmail.com");
			preparedstatement.execute();
			
			
			connection.close();
			System.out.println("data saved");
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}	
		}

}
