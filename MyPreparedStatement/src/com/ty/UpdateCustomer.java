package com.ty;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateCustomer {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/dname","root","root");
			PreparedStatement preparedstatement=connection.prepareStatement("update customer set Customercol=? where id=?");
			preparedstatement.setString(1,"dhanya234@gmail.com");
			preparedstatement.setInt(2,101);
			preparedstatement.execute();
			connection.close();
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
