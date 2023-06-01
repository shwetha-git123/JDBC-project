package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the emp id");
	int id=scan.nextInt();
	
	System.out.println("Enter the emp name");
	String name=scan.next();
	
	System.out.println("Enter the emp age");
	int age=scan.nextInt();
	
	System.out.println("Enter the emp gender");
	String gender=scan.next();
	
	System.out.println("Enter the emp phno");
	int phno=scan.nextInt();
	
	System.out.println("Enter the emp salary");
	double sal=scan.nextDouble();
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/myemployee","root","root");
		PreparedStatement preparedstatement=connection.prepareStatement("insert into employee values(?,?,?,?,?,?)");
		preparedstatement.setInt(1,id);
		preparedstatement.setString(2,name);
		preparedstatement.setInt(3,age);
		preparedstatement.setString(4,gender);
		preparedstatement.setInt(5,phno);
		preparedstatement.setDouble(6,sal);
		
		preparedstatement.execute();
		
		connection.close();
	
		System.out.println("data saved");
		
	}
	catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}
	
	}

}
