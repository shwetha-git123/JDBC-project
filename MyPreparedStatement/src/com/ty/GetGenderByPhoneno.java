package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GetGenderByPhoneno {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/dname","root","root");
			PreparedStatement preparedstatement=connection.prepareStatement("select * from customer");
			ResultSet result=preparedstatement.executeQuery();
			while(result.next()) {
				System.out.println("Gender:"+result.getString(5));
	
			}
			connection.close();
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
